package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Cuentas bancarias de los clientes.
 */
@Entity
@Table(name = "CuentasClientes", schema = "core")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CuentaCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cuentaId")
    private Integer cuentaId;

    @Column(name = "numeroCuenta", nullable = false, length = 12)
    private String numeroCuenta;

    @Column(name = "saldoDisponible", nullable = false, precision = 18, scale = 2)
    private BigDecimal saldoDisponible;

    @Column(name = "saldoContable", nullable = false, precision = 18, scale = 2)
    private BigDecimal saldoContable;

    @Column(name = "fechaApertura", nullable = false)
    private LocalDate fechaApertura;

    @Column(name = "estado", nullable = false, length = 10)
    private String estado;

    /**
     * Cliente propietario de la cuenta.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clienteId", nullable = false)
    private Cliente cliente;

    /**
     * Tipo de cuenta (Ahorros, Corriente, etc).
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipoCuentaId", nullable = false)
    private TipoCuenta tipoCuenta;

    /**
     * Constructor solo para la clave primaria.
     */
    public CuentaCliente(Integer cuentaId) {
        this.cuentaId = cuentaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaCliente that = (CuentaCliente) o;
        return Objects.equals(cuentaId, that.cuentaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuentaId);
    }
}