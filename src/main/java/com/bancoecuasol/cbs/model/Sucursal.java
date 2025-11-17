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
 * Sucursales fisicas del banco.
 */
@Entity
@Table(name = "Sucursales", schema = "administrativos")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Sucursal {

    /**
     * Identificador interno.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sucursalId")
    private Integer sucursalId;

    /**
     * Codigo unico de sucursal.
     */
    @Column(name = "codigoUnico", nullable = false, length = 20)
    private String codigoUnico;

    /**
     * Nombre de sucursal.
     */
    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;

    /**
     * Direccion fisica.
     */
    @Column(name = "direccion", nullable = false, length = 250)
    private String direccion;

    /**
     * Telefono.
     */
    @Column(name = "telefono", length = 30)
    private String telefono;

    /**
     * Latitud.
     */
    @Column(name = "latitud", precision = 10, scale = 7)
    private BigDecimal latitud;

    /**
     * Longitud.
     */
    @Column(name = "longitud", precision = 10, scale = 7)
    private BigDecimal longitud;

    /**
     * Indica si esta activa.
     */
    @Column(name = "activa", nullable = false)
    private Boolean activa;

    /**
     * Fecha de creacion.
     */
    @Column(name = "fechaCreacion", nullable = false)
    private LocalDate fechaCreacion;

    /**
     * Localizacion donde se encuentra.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "localizacionGeograficaId", nullable = false)
    private LocalizacionGeografica localizacionGeografica;

    /**
     * Entidad bancaria propietaria.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entidadBancariaId", nullable = false)
    private EntidadBancaria entidadBancaria;

    /**
     * Constructor solo para la clave primaria.
     */
    public Sucursal(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sucursal sucursal = (Sucursal) o;
        return Objects.equals(sucursalId, sucursal.sucursalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sucursalId);
    }
}
