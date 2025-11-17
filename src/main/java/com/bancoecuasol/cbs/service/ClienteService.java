package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.ClienteRequestDTO;
import com.bancoecuasol.cbs.api.dto.ClienteResponseDTO;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    Optional<ClienteResumenDto> buscarPorUsuario(String usuario);

    List<CuentaDto> obtenerCuentasPorCliente(Integer clienteId);

    ClienteResponseDTO crearCliente(ClienteRequestDTO requestDTO);

    ClienteResponseDTO actualizarCliente(Integer clienteId, ClienteRequestDTO requestDTO);

    ClienteResponseDTO obtenerClientePorId(Integer clienteId);

    List<ClienteResponseDTO> listarClientes();

    void eliminarCliente(Integer clienteId);
}