package com.bancoecuasol.cbs.repository;

import com.bancoecuasol.cbs.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
