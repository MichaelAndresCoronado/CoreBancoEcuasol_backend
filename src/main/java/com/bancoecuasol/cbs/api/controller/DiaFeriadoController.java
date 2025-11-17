package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.DiaFeriadoRequestDTO;
import com.bancoecuasol.cbs.api.dto.DiaFeriadoResponseDTO;
import com.bancoecuasol.cbs.service.DiaFeriadoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dias-feriados")
public class DiaFeriadoController {

    private final DiaFeriadoService diaFeriadoService;

    public DiaFeriadoController(DiaFeriadoService diaFeriadoService) {
        this.diaFeriadoService = diaFeriadoService;
    }

    @GetMapping
    public ResponseEntity<List<DiaFeriadoResponseDTO>> listarDiasFeriados() {
        List<DiaFeriadoResponseDTO> lista = diaFeriadoService.listarDiasFeriados();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{feriadoId}")
    public ResponseEntity<DiaFeriadoResponseDTO> obtenerDiaFeriadoPorId(
            @PathVariable Integer feriadoId) {

        DiaFeriadoResponseDTO response = diaFeriadoService.obtenerDiaFeriadoPorId(feriadoId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<DiaFeriadoResponseDTO> crearDiaFeriado(
            @Valid @RequestBody DiaFeriadoRequestDTO requestDTO) {

        DiaFeriadoResponseDTO creado = diaFeriadoService.crearDiaFeriado(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{feriadoId}")
    public ResponseEntity<DiaFeriadoResponseDTO> actualizarDiaFeriado(
            @PathVariable Integer feriadoId,
            @Valid @RequestBody DiaFeriadoRequestDTO requestDTO) {

        DiaFeriadoResponseDTO actualizado =
                diaFeriadoService.actualizarDiaFeriado(feriadoId, requestDTO);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{feriadoId}")
    public ResponseEntity<Void> eliminarDiaFeriado(@PathVariable Integer feriadoId) {
        diaFeriadoService.eliminarDiaFeriado(feriadoId);
        return ResponseEntity.noContent().build();
    }
}
