package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.CuentaClienteRequestDTO;
import com.bancoecuasol.cbs.api.dto.CuentaClienteResponseDTO;
import com.bancoecuasol.cbs.service.CuentaClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cuentas-clientes")
public class CuentaClienteController {

    private final CuentaClienteService cuentaClienteService;

    public CuentaClienteController(CuentaClienteService cuentaClienteService) {
        this.cuentaClienteService = cuentaClienteService;
    }

    @GetMapping
    public ResponseEntity<List<CuentaClienteResponseDTO>> listarCuentasClientes() {
        List<CuentaClienteResponseDTO> lista = cuentaClienteService.listarCuentasClientes();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{cuentaId}")
    public ResponseEntity<CuentaClienteResponseDTO> obtenerCuentaClientePorId(
            @PathVariable Integer cuentaId) {

        CuentaClienteResponseDTO response =
                cuentaClienteService.obtenerCuentaClientePorId(cuentaId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<CuentaClienteResponseDTO> crearCuentaCliente(
            @Valid @RequestBody CuentaClienteRequestDTO requestDTO) {

        CuentaClienteResponseDTO creada =
                cuentaClienteService.crearCuentaCliente(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @PutMapping("/{cuentaId}")
    public ResponseEntity<CuentaClienteResponseDTO> actualizarCuentaCliente(
            @PathVariable Integer cuentaId,
            @Valid @RequestBody CuentaClienteRequestDTO requestDTO) {

        CuentaClienteResponseDTO actualizada =
                cuentaClienteService.actualizarCuentaCliente(cuentaId, requestDTO);
        return ResponseEntity.ok(actualizada);
    }

    @DeleteMapping("/{cuentaId}")
    public ResponseEntity<Void> eliminarCuentaCliente(@PathVariable Integer cuentaId) {
        cuentaClienteService.eliminarCuentaCliente(cuentaId);
        return ResponseEntity.noContent().build();
    }
}
