package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.SucursalRequestDTO;
import com.bancoecuasol.cbs.api.dto.SucursalResponseDTO;
import com.bancoecuasol.cbs.service.SucursalService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sucursales")
public class SucursalController {

    private final SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    @GetMapping
    public ResponseEntity<List<SucursalResponseDTO>> listarSucursales() {
        List<SucursalResponseDTO> lista = sucursalService.listarSucursales();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{sucursalId}")
    public ResponseEntity<SucursalResponseDTO> obtenerSucursalPorId(
            @PathVariable Integer sucursalId) {

        SucursalResponseDTO response = sucursalService.obtenerSucursalPorId(sucursalId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<SucursalResponseDTO> crearSucursal(
            @Valid @RequestBody SucursalRequestDTO requestDTO) {

        SucursalResponseDTO creada = sucursalService.crearSucursal(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{sucursalId}")
    public ResponseEntity<SucursalResponseDTO> actualizarSucursal(
            @PathVariable Integer sucursalId,
            @Valid @RequestBody SucursalRequestDTO requestDTO) {

        SucursalResponseDTO actualizada =
                sucursalService.actualizarSucursal(sucursalId, requestDTO);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{sucursalId}")
    public ResponseEntity<Void> eliminarSucursal(@PathVariable Integer sucursalId) {
        sucursalService.eliminarSucursal(sucursalId);
        return ResponseEntity.noContent().build();
    }
}
