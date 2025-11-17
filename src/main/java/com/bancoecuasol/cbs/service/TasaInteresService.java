package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.TasaInteresRequestDTO;
import com.bancoecuasol.cbs.api.dto.TasaInteresResponseDTO;

import java.util.List;

public interface TasaInteresService {

    TasaInteresResponseDTO crearTasaInteres(TasaInteresRequestDTO requestDTO);

    TasaInteresResponseDTO actualizarTasaInteres(Integer tasaInteresId,
                                                 TasaInteresRequestDTO requestDTO);

    TasaInteresResponseDTO obtenerTasaInteresPorId(Integer tasaInteresId);

    List<TasaInteresResponseDTO> listarTasasInteres();

    void eliminarTasaInteres(Integer tasaInteresId);
}
