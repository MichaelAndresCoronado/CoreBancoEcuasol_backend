package com.bancoecuasol.cbs.controller;

import com.bancoecuasol.cbs.dto.MovimientoRequest;
import com.bancoecuasol.cbs.dto.MovimientoResponse;
import com.bancoecuasol.cbs.service.MovimientoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transacciones_core")
public class MovimientoController {

    private final MovimientoService movimientoService;

    public MovimientoController(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
    }

    // POST /api/movimientos
    @PostMapping
    public ResponseEntity<MovimientoResponse> procesarMovimiento(
            @RequestBody MovimientoRequest request,
            @RequestHeader(name = "Authorization", required = false) String tokenJwt
    ) {
        MovimientoResponse response = movimientoService.procesarMovimiento(request);
        return ResponseEntity.ok(response);
    }
}
