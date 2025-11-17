package com.bancoecuasol.cbs.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CuentaDto {
    private Integer cuentaId;
    private String numeroCuenta;
    private BigDecimal saldoDisponible;
    private String tipoCuentaNombre;
    private String estado;
}
