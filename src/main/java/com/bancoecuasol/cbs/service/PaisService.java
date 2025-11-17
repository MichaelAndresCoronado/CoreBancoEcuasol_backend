package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.PaisRequestDTO;
import com.bancoecuasol.cbs.api.dto.PaisResponseDTO;

import java.util.List;

public interface PaisService {

    PaisResponseDTO crearPais(PaisRequestDTO requestDTO);

    PaisResponseDTO actualizarPais(Integer paisId, PaisRequestDTO requestDTO);

    PaisResponseDTO obtenerPaisPorId(Integer paisId);

    List<PaisResponseDTO> listarPaises();

    void eliminarPais(Integer paisId);
}
