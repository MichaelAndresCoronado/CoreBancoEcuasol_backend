package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "\"TasasSaldos\"", schema = "core")
public class TasaSaldo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"saldoId\"")
    private Integer saldoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"tasaInteresId\"", nullable = false)
    private TasaInteres tasaInteres;

    @Column(name = "\"saldoMinimo\"", precision = 18, scale = 2, nullable = false)
    private BigDecimal saldoMinimo;

    @Column(name = "\"saldoMaximo\"", precision = 18, scale = 2, nullable = false)
    private BigDecimal saldoMaximo;

    @Column(name = "\"tasa\"", precision = 18, scale = 2, nullable = false)
    private BigDecimal tasa;

    @Column(name = "\"estado\"", length = 10, nullable = false)
    private String estado;

    public TasaSaldo() {
    }

    public Integer getSaldoId() {
        return saldoId;
    }

    public void setSaldoId(Integer saldoId) {
        this.saldoId = saldoId;
    }

    public TasaInteres getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(TasaInteres tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public BigDecimal getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(BigDecimal saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public BigDecimal getSaldoMaximo() {
        return saldoMaximo;
    }

    public void setSaldoMaximo(BigDecimal saldoMaximo) {
        this.saldoMaximo = saldoMaximo;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
