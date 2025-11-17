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
 * Empresas registradas en el sistema.
 */
@Entity
@Table(name = "Empresas", schema = "core")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empresaId")
    private Integer empresaId;

    @Column(name = "tipoIdentificacion", nullable = false, length = 10)
    private String tipoIdentificacion;

    @Column(name = "numeroIdentificacion", nullable = false, length = 13)
    private String numeroIdentificacion;

    @Column(name = "razonSocial", nullable = false, length = 120)
    private String razonSocial;

    @Column(name = "nombreComercial", length = 120)
    private String nombreComercial;

    @Column(name = "correoElectronico", nullable = false, length = 120)
    private String correoElectronico;

    @Column(name = "sectorEconomico", length = 20)
    private String sectorEconomico;

    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Column(name = "direccion", nullable = false, length = 200)
    private String direccion;

    @Column(name = "fechaConstitucion")
    private LocalDate fechaConstitucion;

    @Column(name = "fechaRegistro", nullable = false)
    private LocalDateTime fechaRegistro;

    @Column(name = "fechaModificacion", nullable = false)
    private LocalDateTime fechaModificacion;

    @Column(name = "estado", length = 10)
    private String estado;

    /**
     * Constructor solo para la clave primaria.
     */
    public Empresa(Integer empresaId) {
        this.empresaId = empresaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(empresaId, empresa.empresaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empresaId);
    }
}
