package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

public class SucursalRequestDTO {

    @NotNull(message = "El identificador de localización geográfica es obligatorio.")
    private Integer localizacionGeograficaId;

    @NotNull(message = "El identificador de la entidad bancaria es obligatorio.")
    private Integer entidadBancariaId;

    @NotBlank(message = "El código único de sucursal es obligatorio.")
    @Size(max = 20, message = "El código único no puede superar 20 caracteres.")
    private String codigoUnico;

    @NotBlank(message = "El nombre de la sucursal es obligatorio.")
    @Size(max = 120, message = "El nombre no puede superar 120 caracteres.")
    private String nombre;

    @NotBlank(message = "La dirección es obligatoria.")
    @Size(max = 250, message = "La dirección no puede superar 250 caracteres.")
    private String direccion;

    @Size(max = 30, message = "El teléfono no puede superar 30 caracteres.")
    private String telefono;

    private BigDecimal latitud;

    private BigDecimal longitud;

    @NotNull(message = "Debe indicarse si la sucursal está activa.")
    private Boolean activa;

    @NotNull(message = "La fecha de creación de la sucursal es obligatoria.")
    private LocalDate fechaCreacion;

    public SucursalRequestDTO() {
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
