package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class PaisRequestDTO {

    @NotBlank(message = "El nombre del país es obligatorio.")
    @Size(max = 100, message = "El nombre del país no puede superar 100 caracteres.")
    private String nombre;

    @NotBlank(message = "El código ISO Alpha-2 es obligatorio.")
    @Size(min = 2, max = 2, message = "El código ISO Alpha-2 debe tener exactamente 2 caracteres.")
    private String isoAlpha2;

    @Size(max = 3, message = "El código ISO Alpha-3 no puede superar 3 caracteres.")
    private String isoAlpha3;

    @Size(max = 4, message = "El código numérico ISO no puede superar 4 caracteres.")
    @Pattern(regexp = "^[0-9]*$", message = "El código numérico ISO debe contener solo dígitos.")
    private String codigoNumerico;

    public PaisRequestDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsoAlpha2() {
        return isoAlpha2;
    }

    public void setIsoAlpha2(String isoAlpha2) {
        this.isoAlpha2 = isoAlpha2;
    }

    public String getIsoAlpha3() {
        return isoAlpha3;
    }

    public void setIsoAlpha3(String isoAlpha3) {
        this.isoAlpha3 = isoAlpha3;
    }

    public String getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(String codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }
}
