package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EntidadBancariaRequestDTO {

    @NotBlank(message = "El RUC de la entidad bancaria es obligatorio.")
    @Size(max = 20, message = "El RUC no puede superar 20 caracteres.")
    private String ruc;

    @NotBlank(message = "La razón social es obligatoria.")
    @Size(max = 200, message = "La razón social no puede superar 200 caracteres.")
    private String razonSocial;

    @Size(max = 200, message = "El nombre comercial no puede superar 200 caracteres.")
    private String nombreComercial;

    @Size(max = 200, message = "El sitio web no puede superar 200 caracteres.")
    private String sitioWeb;

    @Size(max = 120, message = "El correo de contacto no puede superar 120 caracteres.")
    @Email(message = "El correo de contacto debe tener un formato válido.")
    private String emailContacto;

    @Size(max = 20, message = "El código internacional no puede superar 20 caracteres.")
    private String codigoInternacional;

    public EntidadBancariaRequestDTO() {
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getCodigoInternacional() {
        return codigoInternacional;
    }

    public void setCodigoInternacional(String codigoInternacional) {
        this.codigoInternacional = codigoInternacional;
    }
}
