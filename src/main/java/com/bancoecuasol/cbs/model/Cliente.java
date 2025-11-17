package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Clientes (usuarios) del sistema.
 */
@Entity
@Table(name = "Clientes", schema = "core")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteId")
    private Integer clienteId;

    @Column(name = "tipoEntidadId", nullable = false)
    private Integer tipoEntidadId;

    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;

    @Column(name = "usuario", nullable = false, length = 60)
    private String usuario;

    @Column(name = "hashPassword", nullable = false, length = 255)
    private String hashPassword;

    @Column(name = "emailRecuperacion", length = 120)
    private String emailRecuperacion;

    @Column(name = "tipoIdentificacion", nullable = false, length = 10)
    private String tipoIdentificacion;

    @Column(name = "numeroIdentificacion", nullable = false, length = 13)
    private String numeroIdentificacion;

    @Column(name = "fechaRegistro", nullable = false)
    private LocalDateTime fechaRegistro;

    @Column(name = "fechaModificacion", nullable = false)
    private LocalDateTime fechaModificacion;

    @Column(name = "estado", nullable = false, length = 10)
    private String estado;

    /**
     * Entidad bancaria a la que pertenece el cliente.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entidadBancariaId", nullable = false)
    private EntidadBancaria entidadBancaria;

    /**
     * Constructor solo para la clave primaria.
     */
    public Cliente(Integer clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(clienteId, cliente.clienteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clienteId);
    }
}
