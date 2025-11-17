package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.EmpresaRequestDTO;
import com.bancoecuasol.cbs.api.dto.EmpresaResponseDTO;
import com.bancoecuasol.cbs.service.EmpresaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping
    public ResponseEntity<List<EmpresaResponseDTO>> listarEmpresas() {
        return ResponseEntity.ok(empresaService.listarEmpresas());
    }

    @GetMapping("/{empresaId}")
    public ResponseEntity<EmpresaResponseDTO> obtenerEmpresaPorId(@PathVariable Integer empresaId) {
        return ResponseEntity.ok(empresaService.obtenerEmpresaPorId(empresaId));
    }

    @PostMapping
    public ResponseEntity<EmpresaResponseDTO> crearEmpresa(
            @Valid @RequestBody EmpresaRequestDTO requestDTO) {

        EmpresaResponseDTO creada = empresaService.crearEmpresa(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{empresaId}")
    public ResponseEntity<EmpresaResponseDTO> actualizarEmpresa(
            @PathVariable Integer empresaId,
            @Valid @RequestBody EmpresaRequestDTO requestDTO) {

        EmpresaResponseDTO actualizada = empresaService.actualizarEmpresa(empresaId, requestDTO);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{empresaId}")
    public ResponseEntity<Void> eliminarEmpresa(@PathVariable Integer empresaId) {
        empresaService.eliminarEmpresa(empresaId);
        return ResponseEntity.noContent().build();
    }
}
