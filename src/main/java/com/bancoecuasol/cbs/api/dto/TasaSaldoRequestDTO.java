package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class TasaSaldoRequestDTO {

    @NotNull(message = "El identificador de tasa de interés es obligatorio.")
    private Integer tasaInteresId;

    @NotNull(message = "El saldo mínimo es obligatorio.")
    @DecimalMin(value = "0.00", inclusive = true,
            message = "El saldo mínimo no puede ser negativo.")
    private BigDecimal saldoMinimo;

    @NotNull(message = "El saldo máximo es obligatorio.")
    @DecimalMin(value = "0.00", inclusive = true,
            message = "El saldo máximo no puede ser negativo.")
    private BigDecimal saldoMaximo;

    @NotNull(message = "La tasa es obligatoria.")
    @DecimalMin(value = "0.00", inclusive = true,
            message = "La tasa no puede ser negativa.")
    private BigDecimal tasa;

    @NotBlank(message = "El estado es obligatorio.")
    @Size(max = 10, message = "El estado no puede superar 10 caracteres.")
    private String estado;

    public TasaSaldoRequestDTO() {
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
