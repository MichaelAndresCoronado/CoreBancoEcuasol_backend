package com.bancoecuasol.cbs.repository;

import com.bancoecuasol.cbs.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    // Spring Data JPA es tan inteligente que si escribes esto,
    // automáticamente crea la consulta: "SELECT * FROM core.Clientes WHERE usuario = ?"
    Optional<Cliente> findByUsuario(String usuario);

}