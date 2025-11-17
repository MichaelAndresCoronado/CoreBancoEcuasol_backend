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
 * Personas naturales registradas en el sistema.
 */
@Entity
@Table(name = "Personas", schema = "core")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Persona {

    /**
     * Identificador interno de la persona.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personaId")
    private Integer personaId;

    /**
     * Tipo de documento.
     */
    @Column(name = "tipoIdentificacion", nullable = false, length = 10)
    private String tipoIdentificacion;

    /**
     * Numero de documento.
     */
    @Column(name = "numeroIdentificacion", nullable = false, length = 13)
    private String numeroIdentificacion;

    /**
     * Nombres de la persona.
     */
    @Column(name = "nombres", nullable = false, length = 120)
    private String nombres;

    /**
     * Apellidos de la persona.
     */
    @Column(name = "apellidos", nullable = false, length = 120)
    private String apellidos;

    /**
     * Genero declarado.
     */
    @Column(name = "genero", nullable = false, length = 15)
    private String genero;

    /**
     * Estado civil.
     */
    @Column(name = "estadoCivil", nullable = false, length = 15)
    private String estadoCivil;

    /**
     * Correo principal.
     */
    @Column(name = "correoElectronico", nullable = false, length = 120)
    private String correoElectronico;

    /**
     * Fecha de nacimiento.
     */
    @Column(name = "fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    /**
     * Telefono de contacto.
     */
    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    /**
     * Direccion.
     */
    @Column(name = "direccion", nullable = false, length = 200)
    private String direccion;

    /**
     * Fecha de registro.
     */
    @Column(name = "fechaRegistro", nullable = false)
    private LocalDateTime fechaRegistro;

    /**
     * Ultima modificacion.
     */
    @Column(name = "fechaModificacion", nullable = false)
    private LocalDateTime fechaModificacion;

    /**
     * Estado ACTIVO/INACTIVO.
     */
    @Column(name = "estado", length = 10)
    private String estado;

    /**
     * Constructor solo para la clave primaria.
     */
    public Persona(Integer personaId) {
        this.personaId = personaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(personaId, persona.personaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personaId);
    }
}
