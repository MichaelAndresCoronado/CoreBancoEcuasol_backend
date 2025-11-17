package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransaccionRequestDTO {

    // Pueden ser nulos según el tipo: depósito/retiro pueden operar con una sola cuenta.
    private Integer cuentaOrigenId;

    private Integer cuentaDestinoId;

    @NotBlank(message = "El tipo de transacción es obligatorio.")
    @Size(max = 15, message = "El tipo de transacción no puede superar 15 caracteres.")
    private String tipoTransaccion; // DEPOSITO, RETIRO, TRANSFERENCIA

    @NotNull(message = "El monto de la transacción es obligatorio.")
    @DecimalMin(value = "0.01", inclusive = true,
            message = "El monto debe ser mayor que cero.")
    private BigDecimal monto;

    @NotBlank(message = "El canal de la transacción es obligatorio.")
    @Size(max = 10, message = "El canal no puede superar 10 caracteres.")
    private String canal; // WEB, APP, ATM, VENTANILLA

    @Size(max = 255, message = "La descripción no puede superar 255 caracteres.")
    private String descripcion;

    @NotNull(message = "La fecha de la transacción es obligatoria.")
    private LocalDateTime fechaTransaccion;

    @NotBlank(message = "El estado de la transacción es obligatorio.")
    @Size(max = 10, message = "El estado no puede superar 10 caracteres.")
    private String estado; // PENDIENTE, APLICADA, ANULADA

    public TransaccionRequestDTO() {
    }

    public Integer getCuentaOrigenId() {
        return cuentaOrigenId;
    }

    public void setCuentaOrigenId(Integer cuentaOrigenId) {
        this.cuentaOrigenId = cuentaOrigenId;
    }

    public Integer getCuentaDestinoId() {
        return cuentaDestinoId;
    }

    public void setCuentaDestinoId(Integer cuentaDestinoId) {
        this.cuentaDestinoId = cuentaDestinoId;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(LocalDateTime fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
