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
 * Configuracion de tasas de interes.
 */
@Entity
@Table(name = "TasasIntereses", schema = "core")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class TasaInteres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tasaInteresId")
    private Integer tasaInteresId;

    @Column(name = "baseCalculo", nullable = false, length = 15)
    private String baseCalculo;

    @Column(name = "tipoAmortizacion", nullable = false, length = 20)
    private String tipoAmortizacion;

    @Column(name = "frecuenciaCapitalizacion", nullable = false, length = 15)
    private String frecuenciaCapitalizacion;

    @Column(name = "tasaMaxima", nullable = false, precision = 18, scale = 2)
    private BigDecimal tasaMaxima;

    @Column(name = "vigenteDesde", nullable = false)
    private LocalDate vigenteDesde;

    @Column(name = "vigenteHasta")
    private LocalDate vigenteHasta;

    @Column(name = "estado", nullable = false, length = 10)
    private String estado;

    /**
     * Constructor solo para la clave primaria.
     */
    public TasaInteres(Integer tasaInteresId) {
        this.tasaInteresId = tasaInteresId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasaInteres that = (TasaInteres) o;
        return Objects.equals(tasaInteresId, that.tasaInteresId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasaInteresId);
    }
}
