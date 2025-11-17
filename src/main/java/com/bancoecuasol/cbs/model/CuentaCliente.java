package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"CuentasClientes\"", schema = "core")
public class CuentaCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"cuentaId\"")
    private Integer cuentaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"clienteId\"", nullable = false)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"tipoCuentaId\"", nullable = false)
    private TipoCuenta tipoCuenta;

    @Column(name = "\"numeroCuenta\"", length = 12, nullable = false)
    private String numeroCuenta;

    @Column(name = "\"saldoDisponible\"", precision = 18, scale = 2, nullable = false)
    private BigDecimal saldoDisponible;

    @Column(name = "\"saldoContable\"", precision = 18, scale = 2, nullable = false)
    private BigDecimal saldoContable;

    @Column(name = "\"fechaApertura\"", nullable = false)
    private LocalDate fechaApertura;

    @Column(name = "\"estado\"", length = 10, nullable = false)
    private String estado;

    public CuentaCliente() {
    }

    public Integer getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(Integer cuentaId) {
        this.cuentaId = cuentaId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public BigDecimal getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(BigDecimal saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public BigDecimal getSaldoContable() {
        return saldoContable;
    }

    public void setSaldoContable(BigDecimal saldoContable) {
        this.saldoContable = saldoContable;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
