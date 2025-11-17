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
 * Registro de dias feriados por pais y localizacion.
 */
@Entity
@Table(name = "DiasFeriados", schema = "administrativos")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class DiaFeriado {

    /**
     * Id del feriado.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feriadoId")
    private Integer feriadoId;

    /**
     * Fecha del feriado.
     */
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    /**
     * Descripcion del feriado.
     */
    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;

    /**
     * True si coincide con fin de semana.
     */
    @Column(name = "esFinDeSemana", nullable = false)
    private Boolean esFinDeSemana;

    /**
     * Pais donde aplica.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paisId", nullable = false)
    private Pais pais;

    /**
     * Localizacion donde aplica (nulo si es nacional).
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "localizacionGeograficaId")
    private LocalizacionGeografica localizacionGeografica;

    /**
     * Constructor solo para la clave primaria.
     */
    public DiaFeriado(Integer feriadoId) {
        this.feriadoId = feriadoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiaFeriado that = (DiaFeriado) o;
        return Objects.equals(feriadoId, that.feriadoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feriadoId);
    }
}
