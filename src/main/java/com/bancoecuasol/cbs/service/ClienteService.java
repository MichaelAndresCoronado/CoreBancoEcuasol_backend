package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.ClienteRequestDTO;
import com.bancoecuasol.cbs.api.dto.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {

    ClienteResponseDTO crearCliente(ClienteRequestDTO requestDTO);

    ClienteResponseDTO actualizarCliente(Integer clienteId, ClienteRequestDTO requestDTO);

    ClienteResponseDTO obtenerClientePorId(Integer clienteId);

    List<ClienteResponseDTO> listarClientes();

    void eliminarCliente(Integer clienteId);
}
