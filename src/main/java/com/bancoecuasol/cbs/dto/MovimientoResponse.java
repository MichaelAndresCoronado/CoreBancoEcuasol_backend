package com.bancoecuasol.cbs.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class MovimientoResponse {

    private boolean exito;
    private String mensaje;

    private Integer cuentaOrigenId;
    private Integer cuentaDestinoId;

    private BigDecimal saldoOrigen;
    private BigDecimal saldoDestino;

    private LocalDateTime fechaTransaccion;
}
