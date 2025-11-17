package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.JerarquiaGeograficaRequestDTO;
import com.bancoecuasol.cbs.api.dto.JerarquiaGeograficaResponseDTO;
import com.bancoecuasol.cbs.service.JerarquiaGeograficaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/jerarquias-geograficas")
public class JerarquiaGeograficaController {

    private final JerarquiaGeograficaService jerarquiaGeograficaService;

    public JerarquiaGeograficaController(JerarquiaGeograficaService jerarquiaGeograficaService) {
        this.jerarquiaGeograficaService = jerarquiaGeograficaService;
    }

    @GetMapping
    public ResponseEntity<List<JerarquiaGeograficaResponseDTO>> obtenerJerarquias() {
        return ResponseEntity.ok(jerarquiaGeograficaService.listarJerarquias());
    }

    @GetMapping("/{id}")
    public ResponseEntity<JerarquiaGeograficaResponseDTO> obtenerJerarquiaPorId(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(jerarquiaGeograficaService.obtenerJerarquiaPorId(id));
    }

    @PostMapping
    public ResponseEntity<JerarquiaGeograficaResponseDTO> crearJerarquia(
            @Valid @RequestBody JerarquiaGeograficaRequestDTO request) {
        JerarquiaGeograficaResponseDTO creada = jerarquiaGeograficaService.crearJerarquia(request);
        return ResponseEntity
                .created(URI.create("/api/jerarquias-geograficas/" + creada.getJerarquiaId()))
                .body(creada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JerarquiaGeograficaResponseDTO> actualizarJerarquia(
            @PathVariable("id") Integer id,
            @Valid @RequestBody JerarquiaGeograficaRequestDTO request) {
        return ResponseEntity.ok(jerarquiaGeograficaService.actualizarJerarquia(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarJerarquia(@PathVariable("id") Integer id) {
        jerarquiaGeograficaService.eliminarJerarquia(id);
        return ResponseEntity.noContent().build();
    }
}
