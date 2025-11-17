package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.TransaccionRequestDTO;
import com.bancoecuasol.cbs.api.dto.TransaccionResponseDTO;

import java.util.List;

public interface TransaccionService {

    TransaccionResponseDTO registrarTransaccion(TransaccionRequestDTO requestDTO);

    TransaccionResponseDTO actualizarTransaccion(Integer transaccionId,
                                                 TransaccionRequestDTO requestDTO);

    TransaccionResponseDTO obtenerTransaccionPorId(Integer transaccionId);

    List<TransaccionResponseDTO> listarTransacciones();

    void eliminarTransaccion(Integer transaccionId);
}
