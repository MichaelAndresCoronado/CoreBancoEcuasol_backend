package com.bancoecuasol.cbs.service;

import com.bancoecuasol.cbs.api.dto.PersonaRequestDTO;
import com.bancoecuasol.cbs.api.dto.PersonaResponseDTO;

import java.util.List;

public interface PersonaService {

    PersonaResponseDTO crearPersona(PersonaRequestDTO requestDTO);

    PersonaResponseDTO actualizarPersona(Integer personaId, PersonaRequestDTO requestDTO);

    PersonaResponseDTO obtenerPersonaPorId(Integer personaId);

    List<PersonaResponseDTO> listarPersonas();

    void eliminarPersona(Integer personaId);
}
