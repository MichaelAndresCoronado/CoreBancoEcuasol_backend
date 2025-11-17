package com.bancoecuasol.cbs.repository;

import com.bancoecuasol.cbs.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
