package com.bancoecuasol.cbs.repository;

import com.bancoecuasol.cbs.model.CuentaCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaClienteRepository extends JpaRepository<CuentaCliente, Integer> {
}
