package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.PaisRequestDTO;
import com.bancoecuasol.cbs.api.dto.PaisResponseDTO;
import com.bancoecuasol.cbs.service.PaisService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisController {

    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping
    public ResponseEntity<List<PaisResponseDTO>> listarPaises() {
        List<PaisResponseDTO> paises = paisService.listarPaises();
        return ResponseEntity.ok(paises);
    }

    @GetMapping("/{paisId}")
    public ResponseEntity<PaisResponseDTO> obtenerPaisPorId(@PathVariable Integer paisId) {
        PaisResponseDTO response = paisService.obtenerPaisPorId(paisId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<PaisResponseDTO> crearPais(@Valid @RequestBody PaisRequestDTO requestDTO) {
        PaisResponseDTO creado = paisService.crearPais(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{paisId}")
    public ResponseEntity<PaisResponseDTO> actualizarPais(
            @PathVariable Integer paisId,
            @Valid @RequestBody PaisRequestDTO requestDTO) {

        PaisResponseDTO actualizado = paisService.actualizarPais(paisId, requestDTO);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{paisId}")
    public ResponseEntity<Void> eliminarPais(@PathVariable Integer paisId) {
        paisService.eliminarPais(paisId);
        return ResponseEntity.noContent().build();
    }
}
