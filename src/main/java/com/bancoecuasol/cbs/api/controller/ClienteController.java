package com.bancoecuasol.cbs.api.controller;

import com.bancoecuasol.cbs.api.dto.ClienteRequestDTO;
import com.bancoecuasol.cbs.api.dto.ClienteResponseDTO;
import com.bancoecuasol.cbs.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
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

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listarClientes() {
        return ResponseEntity.ok(clienteService.listarClientes());
    }

    @GetMapping("/{clienteId}")
    public ResponseEntity<ClienteResponseDTO> obtenerClientePorId(@PathVariable Integer clienteId) {
        return ResponseEntity.ok(clienteService.obtenerClientePorId(clienteId));
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> crearCliente(
            @Valid @RequestBody ClienteRequestDTO requestDTO) {

        ClienteResponseDTO creado = clienteService.crearCliente(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }

    @PutMapping("/{clienteId}")
    public ResponseEntity<ClienteResponseDTO> actualizarCliente(
            @PathVariable Integer clienteId,
            @Valid @RequestBody ClienteRequestDTO requestDTO) {

        ClienteResponseDTO actualizado =
                clienteService.actualizarCliente(clienteId, requestDTO);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{clienteId}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Integer clienteId) {
        clienteService.eliminarCliente(clienteId);
        return ResponseEntity.noContent().build();
    }
}
