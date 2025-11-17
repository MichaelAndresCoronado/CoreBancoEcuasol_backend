package com.bancoecuasol.cbs.service.impl;

import com.bancoecuasol.cbs.dto.MovimientoRequest;
import com.bancoecuasol.cbs.dto.MovimientoResponse;
import com.bancoecuasol.cbs.model.CuentaCliente;
import com.bancoecuasol.cbs.model.Transaccion;
import com.bancoecuasol.cbs.repository.CuentaClienteRepository;
import com.bancoecuasol.cbs.repository.TransaccionRepository;
import com.bancoecuasol.cbs.service.MovimientoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class MovimientoServiceImpl implements MovimientoService {

    private final CuentaClienteRepository cuentaClienteRepository;
    private final TransaccionRepository transaccionRepository;

    public MovimientoServiceImpl(CuentaClienteRepository cuentaClienteRepository,
                                 TransaccionRepository transaccionRepository) {
        this.cuentaClienteRepository = cuentaClienteRepository;
        this.transaccionRepository = transaccionRepository;
    }

    @Override
    @Transactional
    public MovimientoResponse procesarMovimiento(MovimientoRequest request) {
        MovimientoResponse response = new MovimientoResponse();
        response.setFechaTransaccion(LocalDateTime.now());

        BigDecimal monto = request.getMonto();
        if (monto == null || monto.compareTo(BigDecimal.ZERO) <= 0) {
            response.setExito(false);
            response.setMensaje("El monto debe ser mayor a cero");
            return response;
        }

        String tipo = request.getTipoTransaccion();
        if (tipo == null) {
            response.setExito(false);
            response.setMensaje("Debe indicar el tipo de transacción");
            return response;
        }

        CuentaCliente origen = null;
        CuentaCliente destino = null;

        if (request.getCuentaOrigenId() != null) {
            origen = cuentaClienteRepository.findById(request.getCuentaOrigenId())
                    .orElse(null);
            if (origen == null) {
                response.setExito(false);
                response.setMensaje("Cuenta origen no encontrada");
                return response;
            }
        }

        if (request.getCuentaDestinoId() != null) {
            destino = cuentaClienteRepository.findById(request.getCuentaDestinoId())
                    .orElse(null);
            if (destino == null) {
                response.setExito(false);
                response.setMensaje("Cuenta destino no encontrada");
                return response;
            }
        }

        String canal = request.getCanal() != null ? request.getCanal() : "WEB";

        if ("TRANSFERENCIA".equalsIgnoreCase(tipo)) {

            if (origen == null || destino == null) {
                response.setExito(false);
                response.setMensaje("Para una transferencia se requiere cuenta origen y destino");
                return response;
            }

            if (origen.getSaldoDisponible().compareTo(monto) < 0) {
                response.setExito(false);
                response.setMensaje("Saldo insuficiente en la cuenta origen");
                return response;
            }

            origen.setSaldoDisponible(origen.getSaldoDisponible().subtract(monto));
            destino.setSaldoDisponible(destino.getSaldoDisponible().add(monto));
            cuentaClienteRepository.save(origen);
            cuentaClienteRepository.save(destino);

        } else if ("DEPOSITO".equalsIgnoreCase(tipo)) {

            if (destino == null) {
                response.setExito(false);
                response.setMensaje("Para un depósito se requiere cuenta destino");
                return response;
            }

            destino.setSaldoDisponible(destino.getSaldoDisponible().add(monto));
            cuentaClienteRepository.save(destino);

        } else if ("RETIRO".equalsIgnoreCase(tipo)) {

            if (origen == null) {
                response.setExito(false);
                response.setMensaje("Para un retiro se requiere cuenta origen");
                return response;
            }

            if (origen.getSaldoDisponible().compareTo(monto) < 0) {
                response.setExito(false);
                response.setMensaje("Saldo insuficiente para retiro");
                return response;
            }

            origen.setSaldoDisponible(origen.getSaldoDisponible().subtract(monto));
            cuentaClienteRepository.save(origen);

        } else {
            response.setExito(false);
            response.setMensaje("Tipo de transacción no soportado");
            return response;
        }

        // Registrar en core."Transacciones"
        Transaccion tx = new Transaccion();
        tx.setCuentaOrigen(request.getCuentaOrigenId());
        tx.setCuentaDestino(request.getCuentaDestinoId());
        tx.setTipoTransaccion(tipo.toUpperCase());   // DEPOSITO/RETIRO/TRANSFERENCIA
        tx.setMonto(monto);
        tx.setCanal(canal.toUpperCase());            // WEB, APP, etc.
        tx.setDescripcion(request.getDescripcion());
        tx.setFechaTransaccion(response.getFechaTransaccion());
        tx.setEstado("APLICADA");                   // cumple el CHECK de tu script

        transaccionRepository.save(tx);

        response.setExito(true);
        response.setMensaje("Transacción aplicada correctamente");
        response.setCuentaOrigenId(request.getCuentaOrigenId());
        response.setCuentaDestinoId(request.getCuentaDestinoId());
        response.setSaldoOrigen(origen != null ? origen.getSaldoDisponible() : null);
        response.setSaldoDestino(destino != null ? destino.getSaldoDisponible() : null);

        return response;
    }
}
