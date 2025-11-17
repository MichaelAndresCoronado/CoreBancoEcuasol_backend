package com.bancoecuasol.cbs.api.dto;

import java.math.BigDecimal;

public class TasaSaldoResponseDTO {

    private Integer saldoId;
    private Integer tasaInteresId;
    private BigDecimal saldoMinimo;
    private BigDecimal saldoMaximo;
    private BigDecimal tasa;
    private String estado;

    public TasaSaldoResponseDTO() {
    }

    public Integer getSaldoId() {
        return saldoId;
    }

    public void setSaldoId(Integer saldoId) {
        this.saldoId = saldoId;
    }

    public Integer getTasaInteresId() {
        return tasaInteresId;
    }

    public void setTasaInteresId(Integer tasaInteresId) {
        this.tasaInteresId = tasaInteresId;
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
