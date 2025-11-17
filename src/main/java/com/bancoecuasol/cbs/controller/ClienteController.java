package com.bancoecuasol.cbs.controller;

import com.bancoecuasol.cbs.dto.ClienteResumenDto;
import com.bancoecuasol.cbs.dto.CuentaDto;
import com.bancoecuasol.cbs.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // GET /api/clientes/usuario/{usuario}
    @GetMapping("/usuario/{usuario}")
    public ResponseEntity<?> getClientePorUsuario(@PathVariable String usuario) {
        return clienteService.buscarPorUsuario(usuario)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // GET /api/clientes/{clienteId}/cuentas
    @GetMapping("/{clienteId}/cuentas")
    public ResponseEntity<List<CuentaDto>> getCuentasPorCliente(@PathVariable Integer clienteId) {
        List<CuentaDto> cuentas = clienteService.obtenerCuentasPorCliente(clienteId);
        return ResponseEntity.ok(cuentas);
    }
}
