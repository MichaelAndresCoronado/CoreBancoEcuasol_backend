package com.bancoecuasol.cbs.api.dto;

import java.time.LocalDate;

public class TipoCuentaResponseDTO {

    private Integer tipoCuentaId;
    private Integer tasaInteresPorDefectoId;
    private String nombre;
    private String descripcion;
    private String requisitosApertura;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String estado;

    public TipoCuentaResponseDTO() {
    }

    public Integer getTipoCuentaId() {
        return tipoCuentaId;
    }

    public void setTipoCuentaId(Integer tipoCuentaId) {
        this.tipoCuentaId = tipoCuentaId;
    }

    public Integer getTasaInteresPorDefectoId() {
        return tasaInteresPorDefectoId;
    }

    public void setTasaInteresPorDefectoId(Integer tasaInteresPorDefectoId) {
        this.tasaInteresPorDefectoId = tasaInteresPorDefectoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRequisitosApertura() {
        return requisitosApertura;
    }

    public void setRequisitosApertura(String requisitosApertura) {
        this.requisitosApertura = requisitosApertura;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
