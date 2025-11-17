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
 * Catalogo maestro de paises disponibles para configuracion geografica del banco.
 */
@Entity
@Table(name = "Paises", schema = "administrativos")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pais {

    /**
     * Identificador interno del pais.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paisId")
    private Integer paisId;

    /**
     * Nombre oficial del pais.
     */
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    /**
     * Codigo ISO 3166 alfa-2 del pais.
     */
    @Column(name = "isoAlpha2", nullable = false, length = 2)
    private String isoAlpha2;

    /**
     * Codigo ISO 3166 alfa-3 del pais.
     */
    @Column(name = "isoAlpha3", length = 3)
    private String isoAlpha3;

    /**
     * Codigo numerico ISO 3166 del pais.
     */
    @Column(name = "codigoNumerico", length = 4)
    private String codigoNumerico;

    /**
     * Constructor solo para la clave primaria.
     */
    public Pais(Integer paisId) {
        this.paisId = paisId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(paisId, pais.paisId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paisId);
    }
}