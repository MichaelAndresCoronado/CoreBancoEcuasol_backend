package com.bancoecuasol.cbs.repository;

import com.bancoecuasol.cbs.model.CuentaCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CuentaClienteRepository extends JpaRepository<CuentaCliente, Integer> {

    // "SELECT * FROM core.CuentasClientes WHERE cliente.clienteId = ?"
    List<CuentaCliente> findByCliente_ClienteId(Integer clienteId);

}