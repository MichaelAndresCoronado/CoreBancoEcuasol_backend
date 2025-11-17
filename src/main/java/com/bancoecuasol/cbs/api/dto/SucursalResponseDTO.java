package com.bancoecuasol.cbs.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SucursalResponseDTO {

    private Integer sucursalId;
    private Integer localizacionGeograficaId;
    private Integer entidadBancariaId;
    private String codigoUnico;
    private String nombre;
    private String direccion;
    private String telefono;
    private BigDecimal latitud;
    private BigDecimal longitud;
    private Boolean activa;
    private LocalDate fechaCreacion;

    public SucursalResponseDTO() {
    }

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }

    public Integer getLocalizacionGeograficaId() {
        return localizacionGeograficaId;
    }

    public void setLocalizacionGeograficaId(Integer localizacionGeograficaId) {
        this.localizacionGeograficaId = localizacionGeograficaId;
    }

    public Integer getEntidadBancariaId() {
        return entidadBancariaId;
    }

    public void setEntidadBancariaId(Integer entidadBancariaId) {
        this.entidadBancariaId = entidadBancariaId;
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
