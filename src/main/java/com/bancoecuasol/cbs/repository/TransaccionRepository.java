package com.bancoecuasol.cbs.repository;

import com.bancoecuasol.cbs.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository<Transaccion, Integer> {
}
