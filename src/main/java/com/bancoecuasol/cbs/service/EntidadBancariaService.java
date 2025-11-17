package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.EntidadBancariaRequestDTO;
import com.bancoecuasol.cbs.api.dto.EntidadBancariaResponseDTO;

import java.util.List;

public interface EntidadBancariaService {

    EntidadBancariaResponseDTO crearEntidadBancaria(EntidadBancariaRequestDTO requestDTO);

    EntidadBancariaResponseDTO actualizarEntidadBancaria(Integer entidadBancariaId,
                                                         EntidadBancariaRequestDTO requestDTO);

    EntidadBancariaResponseDTO obtenerEntidadBancariaPorId(Integer entidadBancariaId);

    List<EntidadBancariaResponseDTO> listarEntidadesBancarias();

    void eliminarEntidadBancaria(Integer entidadBancariaId);
}
