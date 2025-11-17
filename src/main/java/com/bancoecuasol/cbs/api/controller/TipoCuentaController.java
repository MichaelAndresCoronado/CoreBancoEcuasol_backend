package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.TipoCuentaRequestDTO;
import com.bancoecuasol.cbs.api.dto.TipoCuentaResponseDTO;
import com.bancoecuasol.cbs.service.TipoCuentaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-cuentas")
public class TipoCuentaController {

    private final TipoCuentaService tipoCuentaService;

    public TipoCuentaController(TipoCuentaService tipoCuentaService) {
        this.tipoCuentaService = tipoCuentaService;
    }

    @GetMapping
    public ResponseEntity<List<TipoCuentaResponseDTO>> listarTiposCuentas() {
        List<TipoCuentaResponseDTO> lista = tipoCuentaService.listarTiposCuentas();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{tipoCuentaId}")
    public ResponseEntity<TipoCuentaResponseDTO> obtenerTipoCuentaPorId(
            @PathVariable Integer tipoCuentaId) {

        TipoCuentaResponseDTO response =
                tipoCuentaService.obtenerTipoCuentaPorId(tipoCuentaId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<TipoCuentaResponseDTO> crearTipoCuenta(
            @Valid @RequestBody TipoCuentaRequestDTO requestDTO) {

        TipoCuentaResponseDTO creada =
                tipoCuentaService.crearTipoCuenta(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{tipoCuentaId}")
    public ResponseEntity<TipoCuentaResponseDTO> actualizarTipoCuenta(
            @PathVariable Integer tipoCuentaId,
            @Valid @RequestBody TipoCuentaRequestDTO requestDTO) {

        TipoCuentaResponseDTO actualizada =
                tipoCuentaService.actualizarTipoCuenta(tipoCuentaId, requestDTO);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{tipoCuentaId}")
    public ResponseEntity<Void> eliminarTipoCuenta(@PathVariable Integer tipoCuentaId) {
        tipoCuentaService.eliminarTipoCuenta(tipoCuentaId);
        return ResponseEntity.noContent().build();
    }
}
