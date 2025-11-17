package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.DiaFeriadoRequestDTO;
import com.bancoecuasol.cbs.api.dto.DiaFeriadoResponseDTO;

import java.util.List;

public interface DiaFeriadoService {

    DiaFeriadoResponseDTO crearDiaFeriado(DiaFeriadoRequestDTO requestDTO);

    DiaFeriadoResponseDTO actualizarDiaFeriado(Integer feriadoId, DiaFeriadoRequestDTO requestDTO);

    DiaFeriadoResponseDTO obtenerDiaFeriadoPorId(Integer feriadoId);

    List<DiaFeriadoResponseDTO> listarDiasFeriados();

    void eliminarDiaFeriado(Integer feriadoId);
}
