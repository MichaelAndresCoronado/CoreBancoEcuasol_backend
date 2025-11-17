package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;

public class ClienteRequestDTO {

    @NotNull(message = "El tipo de entidad es obligatorio.")
    @Min(value = 1, message = "El tipo de entidad debe ser 1 (Persona) o 2 (Empresa).")
    @Max(value = 2, message = "El tipo de entidad debe ser 1 (Persona) o 2 (Empresa).")
    private Integer tipoEntidadId;

    @NotNull(message = "La entidad bancaria es obligatoria.")
    private Integer entidadBancariaId;

    @NotBlank(message = "El nombre del cliente es obligatorio.")
    @Size(max = 120, message = "El nombre no puede superar 120 caracteres.")
    private String nombre;

    @NotBlank(message = "El usuario es obligatorio.")
    @Size(max = 60, message = "El usuario no puede superar 60 caracteres.")
    private String usuario;

    @NotBlank(message = "La contraseña es obligatoria.")
    @Size(min = 8, max = 255, message = "La contraseña debe tener al menos 8 caracteres.")
    private String password; // será mapeado a hashPassword en la capa de servicio

    @Size(max = 120, message = "El correo de recuperación no puede superar 120 caracteres.")
    @Email(message = "El correo de recuperación debe tener un formato válido.")
    private String emailRecuperacion;

    @NotBlank(message = "El tipo de identificación es obligatorio.")
    @Size(max = 10, message = "El tipo de identificación no puede superar 10 caracteres.")
    private String tipoIdentificacion;

    @NotBlank(message = "El número de identificación es obligatorio.")
    @Size(max = 13, message = "El número de identificación no puede superar 13 caracteres.")
    private String numeroIdentificacion;

    @NotBlank(message = "El estado es obligatorio.")
    @Size(max = 10, message = "El estado no puede superar 10 caracteres.")
    private String estado;

    public ClienteRequestDTO() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
