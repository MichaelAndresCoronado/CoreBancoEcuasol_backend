package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class JerarquiaGeograficaRequestDTO {

    @NotNull(message = "El identificador de país es obligatorio.")
    private Integer paisId;

    @NotNull(message = "El nombre del nivel es obligatorio.")
    @Size(max = 50, message = "El nombre del nivel no puede superar 50 caracteres.")
    private String nombreNivel;

    @NotNull(message = "El nivel jerárquico es obligatorio.")
    @Min(value = 1, message = "El nivel jerárquico debe ser mayor o igual a 1.")
    private Integer nivel;

    public JerarquiaGeograficaRequestDTO() {
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
