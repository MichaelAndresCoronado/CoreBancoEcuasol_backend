package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public class RepresentanteLegalRequestDTO {

    @NotNull(message = "El identificador de la empresa es obligatorio.")
    private Integer empresaId;

    // Puede ser nulo, según el modelo (representante asociado o no a un cliente digital)
    private Integer clienteId;

    @NotNull(message = "El identificador de la persona es obligatorio.")
    private Integer personaId;

    @Size(max = 25, message = "El rol no puede superar 25 caracteres.")
    private String rol;

    @NotNull(message = "La fecha de asignación es obligatoria.")
    private LocalDateTime fechaAsignacion;

    private LocalDateTime fechaDesvinculacion;

    @NotBlank(message = "El estado es obligatorio.")
    @Size(max = 10, message = "El estado no puede superar 10 caracteres.")
    private String estado;

    public RepresentanteLegalRequestDTO() {
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDateTime getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public LocalDateTime getFechaDesvinculacion() {
        return fechaDesvinculacion;
    }

    public void setFechaDesvinculacion(LocalDateTime fechaDesvinculacion) {
        this.fechaDesvinculacion = fechaDesvinculacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
