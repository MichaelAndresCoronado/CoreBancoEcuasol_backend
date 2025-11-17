package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.RepresentanteLegalRequestDTO;
import com.bancoecuasol.cbs.api.dto.RepresentanteLegalResponseDTO;
import com.bancoecuasol.cbs.service.RepresentanteLegalService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/representantes-legales")
public class RepresentanteLegalController {

    private final RepresentanteLegalService representanteLegalService;

    public RepresentanteLegalController(RepresentanteLegalService representanteLegalService) {
        this.representanteLegalService = representanteLegalService;
    }

    @GetMapping
    public ResponseEntity<List<RepresentanteLegalResponseDTO>> listarRepresentantesLegales() {
        List<RepresentanteLegalResponseDTO> lista =
                representanteLegalService.listarRepresentantesLegales();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{representanteLegalId}")
    public ResponseEntity<RepresentanteLegalResponseDTO> obtenerRepresentanteLegalPorId(
            @PathVariable Integer representanteLegalId) {

        RepresentanteLegalResponseDTO response =
                representanteLegalService.obtenerRepresentanteLegalPorId(representanteLegalId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<RepresentanteLegalResponseDTO> crearRepresentanteLegal(
            @Valid @RequestBody RepresentanteLegalRequestDTO requestDTO) {

        RepresentanteLegalResponseDTO creado =
                representanteLegalService.crearRepresentanteLegal(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{representanteLegalId}")
    public ResponseEntity<RepresentanteLegalResponseDTO> actualizarRepresentanteLegal(
            @PathVariable Integer representanteLegalId,
            @Valid @RequestBody RepresentanteLegalRequestDTO requestDTO) {

        RepresentanteLegalResponseDTO actualizado =
                representanteLegalService.actualizarRepresentanteLegal(
                        representanteLegalId, requestDTO);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{representanteLegalId}")
    public ResponseEntity<Void> eliminarRepresentanteLegal(
            @PathVariable Integer representanteLegalId) {

        representanteLegalService.eliminarRepresentanteLegal(representanteLegalId);
        return ResponseEntity.noContent().build();
    }
}
