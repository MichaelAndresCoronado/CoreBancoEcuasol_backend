package com.bancoecuasol.cbs.service.impl;

import com.bancoecuasol.cbs.dto.ClienteResumenDto;
import com.bancoecuasol.cbs.dto.CuentaDto;
import com.bancoecuasol.cbs.model.CuentaCliente;
import com.bancoecuasol.cbs.repository.ClienteRepository;
import com.bancoecuasol.cbs.repository.CuentaClienteRepository;
import com.bancoecuasol.cbs.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final CuentaClienteRepository cuentaClienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository,
                              CuentaClienteRepository cuentaClienteRepository) {
        this.clienteRepository = clienteRepository;
        this.cuentaClienteRepository = cuentaClienteRepository;
    }

    @Override
    public Optional<ClienteResumenDto> buscarPorUsuario(String usuario) {
        return clienteRepository.findByUsuario(usuario)
                .map(cliente -> {
                    ClienteResumenDto dto = new ClienteResumenDto();
                    dto.setClienteId(cliente.getClienteId());
                    dto.setUsuario(cliente.getUsuario());
                    dto.setNombre(cliente.getNombre());
                    return dto;
                });
    }

    @Override
    public List<CuentaDto> obtenerCuentasPorCliente(Integer clienteId) {
        List<CuentaCliente> cuentas = cuentaClienteRepository.findByCliente_ClienteId(clienteId);
        return cuentas.stream().map(c -> {
            CuentaDto dto = new CuentaDto();
            dto.setCuentaId(c.getCuentaId());
            dto.setNumeroCuenta(c.getNumeroCuenta());
            dto.setSaldoDisponible(c.getSaldoDisponible());
            dto.setEstado(c.getEstado());
            dto.setTipoCuentaNombre(
                    c.getTipoCuenta() != null ? c.getTipoCuenta().getNombre() : null
            );
            return dto;
        }).toList();
    }
}
