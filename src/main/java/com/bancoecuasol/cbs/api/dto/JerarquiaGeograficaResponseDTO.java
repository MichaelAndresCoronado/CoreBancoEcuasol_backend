package com.bancoecuasol.cbs.api.dto;

public class JerarquiaGeograficaResponseDTO {

    private Integer jerarquiaId;
    private Integer paisId;
    private String nombreNivel;
    private Integer nivel;

    public JerarquiaGeograficaResponseDTO() {
    }

    public Integer getJerarquiaId() {
        return jerarquiaId;
    }

    public void setJerarquiaId(Integer jerarquiaId) {
        this.jerarquiaId = jerarquiaId;
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
