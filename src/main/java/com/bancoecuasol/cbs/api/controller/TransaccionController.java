package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.TransaccionRequestDTO;
import com.bancoecuasol.cbs.api.dto.TransaccionResponseDTO;
import com.bancoecuasol.cbs.service.TransaccionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacciones")
public class TransaccionController {

    private final TransaccionService transaccionService;

    public TransaccionController(TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    @GetMapping
    public ResponseEntity<List<TransaccionResponseDTO>> listarTransacciones() {
        List<TransaccionResponseDTO> lista = transaccionService.listarTransacciones();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{transaccionId}")
    public ResponseEntity<TransaccionResponseDTO> obtenerTransaccionPorId(
            @PathVariable Integer transaccionId) {

        TransaccionResponseDTO response =
                transaccionService.obtenerTransaccionPorId(transaccionId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<TransaccionResponseDTO> registrarTransaccion(
            @Valid @RequestBody TransaccionRequestDTO requestDTO) {

        TransaccionResponseDTO creada =
                transaccionService.registrarTransaccion(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{transaccionId}")
    public ResponseEntity<TransaccionResponseDTO> actualizarTransaccion(
            @PathVariable Integer transaccionId,
            @Valid @RequestBody TransaccionRequestDTO requestDTO) {

        TransaccionResponseDTO actualizada =
                transaccionService.actualizarTransaccion(transaccionId, requestDTO);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{transaccionId}")
    public ResponseEntity<Void> eliminarTransaccion(@PathVariable Integer transaccionId) {
        transaccionService.eliminarTransaccion(transaccionId);
        return ResponseEntity.noContent().build();
    }
}
