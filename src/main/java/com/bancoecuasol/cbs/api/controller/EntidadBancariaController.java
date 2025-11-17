package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.EntidadBancariaRequestDTO;
import com.bancoecuasol.cbs.api.dto.EntidadBancariaResponseDTO;
import com.bancoecuasol.cbs.service.EntidadBancariaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entidades-bancarias")
public class EntidadBancariaController {

    private final EntidadBancariaService entidadBancariaService;

    public EntidadBancariaController(EntidadBancariaService entidadBancariaService) {
        this.entidadBancariaService = entidadBancariaService;
    }

    @GetMapping
    public ResponseEntity<List<EntidadBancariaResponseDTO>> listarEntidadesBancarias() {
        List<EntidadBancariaResponseDTO> lista =
                entidadBancariaService.listarEntidadesBancarias();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{entidadBancariaId}")
    public ResponseEntity<EntidadBancariaResponseDTO> obtenerEntidadBancariaPorId(
            @PathVariable Integer entidadBancariaId) {

        EntidadBancariaResponseDTO response =
                entidadBancariaService.obtenerEntidadBancariaPorId(entidadBancariaId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<EntidadBancariaResponseDTO> crearEntidadBancaria(
            @Valid @RequestBody EntidadBancariaRequestDTO requestDTO) {

        EntidadBancariaResponseDTO creada =
                entidadBancariaService.crearEntidadBancaria(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{entidadBancariaId}")
    public ResponseEntity<EntidadBancariaResponseDTO> actualizarEntidadBancaria(
            @PathVariable Integer entidadBancariaId,
            @Valid @RequestBody EntidadBancariaRequestDTO requestDTO) {

        EntidadBancariaResponseDTO actualizada =
                entidadBancariaService.actualizarEntidadBancaria(entidadBancariaId, requestDTO);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{entidadBancariaId}")
    public ResponseEntity<Void> eliminarEntidadBancaria(
            @PathVariable Integer entidadBancariaId) {

        entidadBancariaService.eliminarEntidadBancaria(entidadBancariaId);
        return ResponseEntity.noContent().build();
    }
}
