package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.EmpresaRequestDTO;
import com.bancoecuasol.cbs.api.dto.EmpresaResponseDTO;

import java.util.List;

public interface EmpresaService {

    EmpresaResponseDTO crearEmpresa(EmpresaRequestDTO requestDTO);

    EmpresaResponseDTO actualizarEmpresa(Integer empresaId, EmpresaRequestDTO requestDTO);

    EmpresaResponseDTO obtenerEmpresaPorId(Integer empresaId);

    List<EmpresaResponseDTO> listarEmpresas();

    void eliminarEmpresa(Integer empresaId);
}
