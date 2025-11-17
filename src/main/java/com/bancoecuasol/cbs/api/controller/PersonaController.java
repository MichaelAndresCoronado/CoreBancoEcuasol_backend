package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.PersonaRequestDTO;
import com.bancoecuasol.cbs.api.dto.PersonaResponseDTO;
import com.bancoecuasol.cbs.service.PersonaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public ResponseEntity<List<PersonaResponseDTO>> listarPersonas() {
        return ResponseEntity.ok(personaService.listarPersonas());
    }

    @GetMapping("/{personaId}")
    public ResponseEntity<PersonaResponseDTO> obtenerPersonaPorId(@PathVariable Integer personaId) {
        return ResponseEntity.ok(personaService.obtenerPersonaPorId(personaId));
    }

    @PostMapping
    public ResponseEntity<PersonaResponseDTO> crearPersona(
            @Valid @RequestBody PersonaRequestDTO requestDTO) {

        PersonaResponseDTO creada = personaService.crearPersona(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{personaId}")
    public ResponseEntity<PersonaResponseDTO> actualizarPersona(
            @PathVariable Integer personaId,
            @Valid @RequestBody PersonaRequestDTO requestDTO) {

        PersonaResponseDTO actualizada = personaService.actualizarPersona(personaId, requestDTO);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{personaId}")
    public ResponseEntity<Void> eliminarPersona(@PathVariable Integer personaId) {
        personaService.eliminarPersona(personaId);
        return ResponseEntity.noContent().build();
    }
}
