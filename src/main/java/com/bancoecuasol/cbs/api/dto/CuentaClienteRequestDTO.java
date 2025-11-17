package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CuentaClienteRequestDTO {

    @NotBlank
    @Size(max = 34) // soportar IBAN/formatos largos si aplica
    private String numeroCuenta;

    @NotNull
    @Digits(integer = 18, fraction = 2)
    private BigDecimal saldoDisponible;

    @NotNull
    @Digits(integer = 18, fraction = 2)
    private BigDecimal saldoContable;

    @NotNull
    private LocalDate fechaApertura;

    @NotBlank
    @Size(max = 10)
    private String estado;

    @NotNull
    private Integer clienteId;

    @NotNull
    private Integer tipoCuentaId;
}
