package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.TasaSaldoRequestDTO;
import com.bancoecuasol.cbs.api.dto.TasaSaldoResponseDTO;
import com.bancoecuasol.cbs.service.TasaSaldoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasas-saldo")
public class TasaSaldoController {

    private final TasaSaldoService tasaSaldoService;

    public TasaSaldoController(TasaSaldoService tasaSaldoService) {
        this.tasaSaldoService = tasaSaldoService;
    }

    @GetMapping
    public ResponseEntity<List<TasaSaldoResponseDTO>> listarTasasSaldo() {
        List<TasaSaldoResponseDTO> lista = tasaSaldoService.listarTasasSaldo();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{saldoId}")
    public ResponseEntity<TasaSaldoResponseDTO> obtenerTasaSaldoPorId(
            @PathVariable Integer saldoId) {

        TasaSaldoResponseDTO response =
                tasaSaldoService.obtenerTasaSaldoPorId(saldoId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<TasaSaldoResponseDTO> crearTasaSaldo(
            @Valid @RequestBody TasaSaldoRequestDTO requestDTO) {

        TasaSaldoResponseDTO creada =
                tasaSaldoService.crearTasaSaldo(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{saldoId}")
    public ResponseEntity<TasaSaldoResponseDTO> actualizarTasaSaldo(
            @PathVariable Integer saldoId,
            @Valid @RequestBody TasaSaldoRequestDTO requestDTO) {

        TasaSaldoResponseDTO actualizada =
                tasaSaldoService.actualizarTasaSaldo(saldoId, requestDTO);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{saldoId}")
    public ResponseEntity<Void> eliminarTasaSaldo(@PathVariable Integer saldoId) {
        tasaSaldoService.eliminarTasaSaldo(saldoId);
        return ResponseEntity.noContent().build();
    }
}
