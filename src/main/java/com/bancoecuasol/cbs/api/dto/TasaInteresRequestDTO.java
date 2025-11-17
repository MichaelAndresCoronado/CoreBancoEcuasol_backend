package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TasaInteresRequestDTO {

    @NotBlank(message = "La base de cálculo es obligatoria.")
    @Size(max = 15, message = "La base de cálculo no puede superar 15 caracteres.")
    private String baseCalculo;

    @NotBlank(message = "El tipo de amortización es obligatorio.")
    @Size(max = 20, message = "El tipo de amortización no puede superar 20 caracteres.")
    private String tipoAmortizacion;

    @NotBlank(message = "La frecuencia de capitalización es obligatoria.")
    @Size(max = 15, message = "La frecuencia de capitalización no puede superar 15 caracteres.")
    private String frecuenciaCapitalizacion;

    @NotNull(message = "La tasa máxima es obligatoria.")
    @DecimalMin(value = "0.00", inclusive = true,
            message = "La tasa máxima no puede ser negativa.")
    private BigDecimal tasaMaxima;

    @NotNull(message = "La fecha de vigencia desde es obligatoria.")
    private LocalDate vigenteDesde;

    private LocalDate vigenteHasta;

    @NotBlank(message = "El estado es obligatorio.")
    @Size(max = 10, message = "El estado no puede superar 10 caracteres.")
    private String estado;

    public TasaInteresRequestDTO() {
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
