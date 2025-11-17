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

@Entity
@Table(name = "JerarquiasGeograficas", schema = "administrativos")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class JerarquiaGeografica {

    /**
     * Identificador interno de la jerarquia geografica.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jerarquiaId")
    private Integer jerarquiaId;

    /**
     * Nombre del nivel geografico (Provincia, Canton, etc).
     */
    @Column(name = "nombreNivel", nullable = false, length = 50)
    private String nombreNivel;

    /**
     * Orden jerarquico.
     */
    @Column(name = "nivel", nullable = false)
    private Integer nivel;

    /**
     * Pais al que pertenece esta jerarquia.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paisId", nullable = false)
    private Pais pais;

    /**
     * Constructor solo para la clave primaria.
     */
    public JerarquiaGeografica(Integer jerarquiaId) {
        this.jerarquiaId = jerarquiaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JerarquiaGeografica that = (JerarquiaGeografica) o;
        return Objects.equals(jerarquiaId, that.jerarquiaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jerarquiaId);
    }
}