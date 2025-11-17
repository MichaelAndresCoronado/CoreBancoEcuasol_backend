package com.bancoecuasol.cbs.api.dto;

import java.time.LocalDateTime;

public class RepresentanteLegalResponseDTO {

    private Integer representanteLegalId;
    private Integer empresaId;
    private Integer clienteId;
    private Integer personaId;
    private String rol;
    private LocalDateTime fechaAsignacion;
    private LocalDateTime fechaDesvinculacion;
    private String estado;

    public RepresentanteLegalResponseDTO() {
    }

    public Integer getRepresentanteLegalId() {
        return representanteLegalId;
    }

    public void setRepresentanteLegalId(Integer representanteLegalId) {
        this.representanteLegalId = representanteLegalId;
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
