package com.bancoecuasol.cbs.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MovimientoRequest {

    // Para TRANSFERENCIA y RETIRO
    private Integer cuentaOrigenId;

    // Para TRANSFERENCIA y DEPOSITO
    private Integer cuentaDestinoId;

    private BigDecimal monto;
    private String descripcion;

    // WEB, APP, ATM, VENTANILLA
    private String canal;

    // DEPOSITO, RETIRO, TRANSFERENCIA
    private String tipoTransaccion;
}
