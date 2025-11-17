package com.bancoecuasol.cbs.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TasaInteresResponseDTO {

    private Integer tasaInteresId;
    private String baseCalculo;
    private String tipoAmortizacion;
    private String frecuenciaCapitalizacion;
    private BigDecimal tasaMaxima;
    private LocalDate vigenteDesde;
    private LocalDate vigenteHasta;
    private String estado;

    public TasaInteresResponseDTO() {
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
