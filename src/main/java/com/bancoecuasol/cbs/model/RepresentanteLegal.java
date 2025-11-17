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
 * Representantes legales asociados a empresas.
 */
@Entity
@Table(name = "RepresentantesLegales", schema = "core")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class RepresentanteLegal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "representanteLegalId")
    private Integer representanteLegalId;

    @Column(name = "rol", length = 25)
    private String rol;

    @Column(name = "fechaAsignacion", nullable = false)
    private LocalDateTime fechaAsignacion;

    @Column(name = "fechaDesvinculacion")
    private LocalDateTime fechaDesvinculacion;

    @Column(name = "estado", nullable = false, length = 10)
    private String estado;

    /**
     * Empresa a la que representa.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresaId", nullable = false)
    private Empresa empresa;

    /**
     * Cliente (usuario) asociado al representante, si aplica.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clienteId")
    private Cliente cliente;

    /**
     * Datos personales del representante.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personaId", nullable = false)
    private Persona persona;

    /**
     * Constructor solo para la clave primaria.
     */
    public RepresentanteLegal(Integer representanteLegalId) {
        this.representanteLegalId = representanteLegalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepresentanteLegal that = (RepresentanteLegal) o;
        return Objects.equals(representanteLegalId, that.representanteLegalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(representanteLegalId);
    }
}
