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
 * Transacciones (Depositos, Retiros, Transferencias).
 */
@Entity
@Table(name = "Transacciones", schema = "core")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaccionId")
    private Integer transaccionId;

    /**
     * Nota: FK no definida en script, se mapea como Integer.
     */
    @Column(name = "cuentaOrigen")
    private Integer cuentaOrigen;

    /**
     * Nota: FK no definida en script, se mapea como Integer.
     */
    @Column(name = "cuentaDestino")
    private Integer cuentaDestino;

    @Column(name = "tipoTransaccion", nullable = false, length = 15)
    private String tipoTransaccion;

    @Column(name = "monto", nullable = false, precision = 18, scale = 2)
    private BigDecimal monto;

    @Column(name = "canal", nullable = false, length = 10)
    private String canal;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "fechaTransaccion", nullable = false)
    private LocalDateTime fechaTransaccion;

    @Column(name = "estado", nullable = false, length = 10)
    private String estado;

    /**
     * Constructor solo para la clave primaria.
     */
    public Transaccion(Integer transaccionId) {
        this.transaccionId = transaccionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaccion that = (Transaccion) o;
        return Objects.equals(transaccionId, that.transaccionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaccionId);
    }
}
