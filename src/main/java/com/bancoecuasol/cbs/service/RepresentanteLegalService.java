package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.RepresentanteLegalRequestDTO;
import com.bancoecuasol.cbs.api.dto.RepresentanteLegalResponseDTO;

import java.util.List;

public interface RepresentanteLegalService {

    RepresentanteLegalResponseDTO crearRepresentanteLegal(RepresentanteLegalRequestDTO requestDTO);

    RepresentanteLegalResponseDTO actualizarRepresentanteLegal(Integer representanteLegalId,
                                                               RepresentanteLegalRequestDTO requestDTO);

    RepresentanteLegalResponseDTO obtenerRepresentanteLegalPorId(Integer representanteLegalId);

    List<RepresentanteLegalResponseDTO> listarRepresentantesLegales();

    void eliminarRepresentanteLegal(Integer representanteLegalId);
}
