package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.SucursalRequestDTO;
import com.bancoecuasol.cbs.api.dto.SucursalResponseDTO;

import java.util.List;

public interface SucursalService {

    SucursalResponseDTO crearSucursal(SucursalRequestDTO requestDTO);

    SucursalResponseDTO actualizarSucursal(Integer sucursalId, SucursalRequestDTO requestDTO);

    SucursalResponseDTO obtenerSucursalPorId(Integer sucursalId);

    List<SucursalResponseDTO> listarSucursales();

    void eliminarSucursal(Integer sucursalId);
}
