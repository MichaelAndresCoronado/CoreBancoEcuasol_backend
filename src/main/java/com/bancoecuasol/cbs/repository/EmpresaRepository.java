package com.bancoecuasol.cbs.repository;

import com.bancoecuasol.cbs.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
