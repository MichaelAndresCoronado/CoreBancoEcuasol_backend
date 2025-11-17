package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "\"Sucursales\"", schema = "administrativos")
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"sucursalId\"")
    private Integer sucursalId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"localizacionGeograficaId\"", nullable = false)
    private LocalizacionGeografica localizacionGeografica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"entidadBancariaId\"", nullable = false)
    private EntidadBancaria entidadBancaria;

    @Column(name = "\"codigoUnico\"", length = 20, nullable = false)
    private String codigoUnico;

    @Column(name = "\"nombre\"", length = 120, nullable = false)
    private String nombre;

    @Column(name = "\"direccion\"", length = 250, nullable = false)
    private String direccion;

    @Column(name = "\"telefono\"", length = 30)
    private String telefono;

    @Column(name = "\"latitud\"", precision = 10, scale = 7)
    private BigDecimal latitud;

    @Column(name = "\"longitud\"", precision = 10, scale = 7)
    private BigDecimal longitud;

    @Column(name = "\"activa\"", nullable = false)
    private Boolean activa;

    @Column(name = "\"fechaCreacion\"", nullable = false)
    private LocalDate fechaCreacion;

    public Sucursal() {
    }

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }

    public LocalizacionGeografica getLocalizacionGeografica() {
        return localizacionGeografica;
    }

    public void setLocalizacionGeografica(LocalizacionGeografica localizacionGeografica) {
        this.localizacionGeografica = localizacionGeografica;
    }

    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
