package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class TipoCuentaRequestDTO {

    // Puede ser nulo si no hay tasa por defecto
    private Integer tasaInteresPorDefectoId;

    @NotBlank(message = "El nombre del tipo de cuenta es obligatorio.")
    @Size(max = 100, message = "El nombre no puede superar 100 caracteres.")
    private String nombre;

    @NotBlank(message = "La descripción es obligatoria.")
    @Size(max = 120, message = "La descripción no puede superar 120 caracteres.")
    private String descripcion;

    @NotBlank(message = "Los requisitos de apertura son obligatorios.")
    @Size(max = 250, message = "Los requisitos no pueden superar 250 caracteres.")
    private String requisitosApertura;

    @NotNull(message = "La fecha de creación es obligatoria.")
    private LocalDate fechaCreacion;

    @NotNull(message = "La fecha de modificación es obligatoria.")
    private LocalDate fechaModificacion;

    @NotBlank(message = "El estado es obligatorio.")
    @Size(max = 10, message = "El estado no puede superar 10 caracteres.")
    private String estado;

    public TipoCuentaRequestDTO() {
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
