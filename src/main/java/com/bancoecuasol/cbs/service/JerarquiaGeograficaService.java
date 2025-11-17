package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.JerarquiaGeograficaRequestDTO;
import com.bancoecuasol.cbs.api.dto.JerarquiaGeograficaResponseDTO;

import java.util.List;

public interface JerarquiaGeograficaService {

    JerarquiaGeograficaResponseDTO crearJerarquia(JerarquiaGeograficaRequestDTO requestDTO);

    JerarquiaGeograficaResponseDTO actualizarJerarquia(Integer jerarquiaId,
                                                       JerarquiaGeograficaRequestDTO requestDTO);

    JerarquiaGeograficaResponseDTO obtenerJerarquiaPorId(Integer jerarquiaId);

    List<JerarquiaGeograficaResponseDTO> listarJerarquias();

    void eliminarJerarquia(Integer jerarquiaId);
}
