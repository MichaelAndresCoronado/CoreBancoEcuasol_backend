package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"TasasIntereses\"", schema = "core")
public class TasaInteres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"tasaInteresId\"")
    private Integer tasaInteresId;

    @Column(name = "\"baseCalculo\"", length = 15, nullable = false)
    private String baseCalculo;

    @Column(name = "\"tipoAmortizacion\"", length = 20, nullable = false)
    private String tipoAmortizacion;

    @Column(name = "\"frecuenciaCapitalizacion\"", length = 15, nullable = false)
    private String frecuenciaCapitalizacion;

    @Column(name = "\"tasaMaxima\"", precision = 18, scale = 2, nullable = false)
    private BigDecimal tasaMaxima;

    @Column(name = "\"vigenteDesde\"", nullable = false)
    private LocalDate vigenteDesde;

    @Column(name = "\"vigenteHasta\"")
    private LocalDate vigenteHasta;

    @Column(name = "\"estado\"", length = 10, nullable = false)
    private String estado;

    public TasaInteres() {
    }

    public Integer getTasaInteresId() {
        return tasaInteresId;
    }

    public void setTasaInteresId(Integer tasaInteresId) {
        this.tasaInteresId = tasaInteresId;
    }

    public String getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(String baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public String getTipoAmortizacion() {
        return tipoAmortizacion;
    }

    public void setTipoAmortizacion(String tipoAmortizacion) {
        this.tipoAmortizacion = tipoAmortizacion;
    }

    public String getFrecuenciaCapitalizacion() {
        return frecuenciaCapitalizacion;
    }

    public void setFrecuenciaCapitalizacion(String frecuenciaCapitalizacion) {
        this.frecuenciaCapitalizacion = frecuenciaCapitalizacion;
    }

    public BigDecimal getTasaMaxima() {
        return tasaMaxima;
    }

    public void setTasaMaxima(BigDecimal tasaMaxima) {
        this.tasaMaxima = tasaMaxima;
    }

    public LocalDate getVigenteDesde() {
        return vigenteDesde;
    }

    public void setVigenteDesde(LocalDate vigenteDesde) {
        this.vigenteDesde = vigenteDesde;
    }

    public LocalDate getVigenteHasta() {
        return vigenteHasta;
    }

    public void setVigenteHasta(LocalDate vigenteHasta) {
        this.vigenteHasta = vigenteHasta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
