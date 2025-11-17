package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"Transacciones\"", schema = "core")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"transaccionId\"")
    private Integer transaccionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"cuentaOrigen\"")
    private CuentaCliente cuentaOrigen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"cuentaDestino\"")
    private CuentaCliente cuentaDestino;

    @Column(name = "\"tipoTransaccion\"", length = 15, nullable = false)
    private String tipoTransaccion;

    @Column(name = "\"monto\"", precision = 18, scale = 2, nullable = false)
    private BigDecimal monto;

    @Column(name = "\"canal\"", length = 10, nullable = false)
    private String canal;

    @Column(name = "\"descripcion\"", length = 255)
    private String descripcion;

    @Column(name = "\"fechaTransaccion\"", nullable = false)
    private LocalDateTime fechaTransaccion;

    @Column(name = "\"estado\"", length = 10, nullable = false)
    private String estado;

    public Transaccion() {
    }

    public Integer getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId(Integer transaccionId) {
        this.transaccionId = transaccionId;
    }

    public CuentaCliente getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaCliente cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public CuentaCliente getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaCliente cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
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
