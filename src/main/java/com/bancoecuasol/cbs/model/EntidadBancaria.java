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
 * Catalogo de entidades bancarias del sistema.
 */
@Entity
@Table(name = "EntidadesBancarias", schema = "administrativos")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class EntidadBancaria {

    /**
     * Identificador interno de la entidad bancaria.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entidadBancariaId")
    private Integer entidadBancariaId;

    /**
     * RUC de la entidad.
     */
    @Column(name = "ruc", nullable = false, length = 20)
    private String ruc;

    /**
     * Razon social registrada.
     */
    @Column(name = "razonSocial", nullable = false, length = 200)
    private String razonSocial;

    /**
     * Nombre comercial.
     */
    @Column(name = "nombreComercial", length = 200)
    private String nombreComercial;

    /**
     * Sitio web.
     */
    @Column(name = "sitioWeb", length = 200)
    private String sitioWeb;

    /**
     * Correo de contacto.
     */
    @Column(name = "emailContacto", length = 120)
    private String emailContacto;

    /**
     * Codigo SWIFT.
     */
    @Column(name = "codigoInternacional", length = 20)
    private String codigoInternacional;

    /**
     * Constructor solo para la clave primaria.
     */
    public EntidadBancaria(Integer entidadBancariaId) {
        this.entidadBancariaId = entidadBancariaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntidadBancaria that = (EntidadBancaria) o;
        return Objects.equals(entidadBancariaId, that.entidadBancariaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entidadBancariaId);
    }
}
