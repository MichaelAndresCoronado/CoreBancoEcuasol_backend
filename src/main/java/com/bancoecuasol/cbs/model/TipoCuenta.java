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
 * Catalogo de tipos de cuentas (Ahorros, Corriente, etc).
 */
@Entity
@Table(name = "TiposCuentas", schema = "core")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class TipoCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoCuentaId")
    private Integer tipoCuentaId;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 120)
    private String descripcion;

    @Column(name = "requisitosApertura", nullable = false, length = 250)
    private String requisitosApertura;

    @Column(name = "fechaCreacion", nullable = false)
    private LocalDate fechaCreacion;

    @Column(name = "fechaModificacion", nullable = false)
    private LocalDate fechaModificacion;

    @Column(name = "estado", nullable = false, length = 10)
    private String estado;

    /**
     * Tasa de interes por defecto para este tipo de cuenta.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tasaInteresPorDefectoId")
    private TasaInteres tasaInteresPorDefecto;

    /**
     * Constructor solo para la clave primaria.
     */
    public TipoCuenta(Integer tipoCuentaId) {
        this.tipoCuentaId = tipoCuentaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoCuenta that = (TipoCuenta) o;
        return Objects.equals(tipoCuentaId, that.tipoCuentaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoCuentaId);
    }
}
