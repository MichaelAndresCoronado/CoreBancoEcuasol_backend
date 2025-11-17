package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.dto.ClienteResumenDto;
import com.bancoecuasol.cbs.dto.CuentaDto;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    Optional<ClienteResumenDto> buscarPorUsuario(String usuario);

    List<CuentaDto> obtenerCuentasPorCliente(Integer clienteId);
}
