package com.bancoecuasol.cbs.api.dto;

import java.time.LocalDateTime;

public class ClienteResponseDTO {

    private Integer clienteId;
    private Integer tipoEntidadId;
    private Integer entidadBancariaId;
    private String nombre;
    private String usuario;
    private String emailRecuperacion;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaModificacion;
    private String estado;

    public ClienteResponseDTO() {
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getTipoEntidadId() {
        return tipoEntidadId;
    }

    public void setTipoEntidadId(Integer tipoEntidadId) {
        this.tipoEntidadId = tipoEntidadId;
    }

    public Integer getEntidadBancariaId() {
        return entidadBancariaId;
    }

    public void setEntidadBancariaId(Integer entidadBancariaId) {
        this.entidadBancariaId = entidadBancariaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmailRecuperacion() {
        return emailRecuperacion;
    }

    public void setEmailRecuperacion(String emailRecuperacion) {
        this.emailRecuperacion = emailRecuperacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
