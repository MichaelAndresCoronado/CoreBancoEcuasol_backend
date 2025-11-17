package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.TasaInteresRequestDTO;
import com.bancoecuasol.cbs.api.dto.TasaInteresResponseDTO;
import com.bancoecuasol.cbs.service.TasaInteresService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasas-interes")
public class TasaInteresController {

    private final TasaInteresService tasaInteresService;

    public TasaInteresController(TasaInteresService tasaInteresService) {
        this.tasaInteresService = tasaInteresService;
    }

    @GetMapping
    public ResponseEntity<List<TasaInteresResponseDTO>> listarTasasInteres() {
        List<TasaInteresResponseDTO> lista = tasaInteresService.listarTasasInteres();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{tasaInteresId}")
    public ResponseEntity<TasaInteresResponseDTO> obtenerTasaInteresPorId(
            @PathVariable Integer tasaInteresId) {

        TasaInteresResponseDTO response =
                tasaInteresService.obtenerTasaInteresPorId(tasaInteresId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<TasaInteresResponseDTO> crearTasaInteres(
            @Valid @RequestBody TasaInteresRequestDTO requestDTO) {

        TasaInteresResponseDTO creada =
                tasaInteresService.crearTasaInteres(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{tasaInteresId}")
    public ResponseEntity<TasaInteresResponseDTO> actualizarTasaInteres(
            @PathVariable Integer tasaInteresId,
            @Valid @RequestBody TasaInteresRequestDTO requestDTO) {

        TasaInteresResponseDTO actualizada =
                tasaInteresService.actualizarTasaInteres(tasaInteresId, requestDTO);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{tasaInteresId}")
    public ResponseEntity<Void> eliminarTasaInteres(@PathVariable Integer tasaInteresId) {
        tasaInteresService.eliminarTasaInteres(tasaInteresId);
        return ResponseEntity.noContent().build();
    }
}
