package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.CuentaClienteRequestDTO;
import com.bancoecuasol.cbs.api.dto.CuentaClienteResponseDTO;

import java.util.List;

public interface CuentaClienteService {

    CuentaClienteResponseDTO crearCuentaCliente(CuentaClienteRequestDTO requestDTO);

    CuentaClienteResponseDTO actualizarCuentaCliente(Integer cuentaId,
                                                     CuentaClienteRequestDTO requestDTO);

    CuentaClienteResponseDTO obtenerCuentaClientePorId(Integer cuentaId);

    List<CuentaClienteResponseDTO> listarCuentasClientes();

    void eliminarCuentaCliente(Integer cuentaId);
}
