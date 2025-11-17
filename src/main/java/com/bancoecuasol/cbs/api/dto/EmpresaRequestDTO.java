package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class EmpresaRequestDTO {

    @NotBlank(message = "El tipo de identificación es obligatorio.")
    @Size(max = 10, message = "El tipo de identificación no puede superar 10 caracteres.")
    private String tipoIdentificacion;

    @NotBlank(message = "El número de identificación es obligatorio.")
    @Size(max = 13, message = "El número de identificación no puede superar 13 caracteres.")
    private String numeroIdentificacion;

    @NotBlank(message = "La razón social es obligatoria.")
    @Size(max = 120, message = "La razón social no puede superar 120 caracteres.")
    private String razonSocial;

    @Size(max = 120, message = "El nombre comercial no puede superar 120 caracteres.")
    private String nombreComercial;

    @NotBlank(message = "El correo electrónico es obligatorio.")
    @Size(max = 120, message = "El correo electrónico no puede superar 120 caracteres.")
    @Email(message = "El correo electrónico debe tener un formato válido.")
    private String correoElectronico;

    @Size(max = 20, message = "El sector económico no puede superar 20 caracteres.")
    private String sectorEconomico;

    @NotBlank(message = "El teléfono es obligatorio.")
    @Size(max = 15, message = "El teléfono no puede superar 15 caracteres.")
    private String telefono;

    @NotBlank(message = "La dirección es obligatoria.")
    @Size(max = 200, message = "La dirección no puede superar 200 caracteres.")
    private String direccion;

    private LocalDate fechaConstitucion;

    @Size(max = 10, message = "El estado no puede superar 10 caracteres.")
    private String estado;

    public EmpresaRequestDTO() {
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaConstitucion() {
        return fechaConstitucion;
    }

    public void setFechaConstitucion(LocalDate fechaConstitucion) {
        this.fechaConstitucion = fechaConstitucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
