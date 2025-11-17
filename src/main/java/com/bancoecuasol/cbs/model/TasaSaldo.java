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
 * Rangos de saldos para aplicar tasas de interes.
 */
@Entity
@Table(name = "TasasSaldos", schema = "core")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class TasaSaldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "saldoId")
    private Integer saldoId;

    @Column(name = "saldoMinimo", nullable = false, precision = 18, scale = 2)
    private BigDecimal saldoMinimo;

    @Column(name = "saldoMaximo", nullable = false, precision = 18, scale = 2)
    private BigDecimal saldoMaximo;

    @Column(name = "tasa", nullable = false, precision = 18, scale = 2)
    private BigDecimal tasa;

    @Column(name = "estado", nullable = false, length = 10)
    private String estado;

    /**
     * Tasa de interes a la que pertenece este rango.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tasaInteresId", nullable = false)
    private TasaInteres tasaInteres;

    /**
     * Constructor solo para la clave primaria.
     */
    public TasaSaldo(Integer saldoId) {
        this.saldoId = saldoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasaSaldo tasaSaldo = (TasaSaldo) o;
        return Objects.equals(saldoId, tasaSaldo.saldoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldoId);
    }
}