package com.bancoecuasol.cbs.api.dto;

import java.time.LocalDate;

public class DiaFeriadoResponseDTO {

    private Integer feriadoId;
    private Integer paisId;
    private Integer localizacionGeograficaId;
    private LocalDate fecha;
    private String descripcion;
    private Boolean esFinDeSemana;

    public DiaFeriadoResponseDTO() {
    }

    public Integer getFeriadoId() {
        return feriadoId;
    }

    public void setFeriadoId(Integer feriadoId) {
        this.feriadoId = feriadoId;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public Integer getLocalizacionGeograficaId() {
        return localizacionGeograficaId;
    }

    public void setLocalizacionGeograficaId(Integer localizacionGeograficaId) {
        this.localizacionGeograficaId = localizacionGeograficaId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEsFinDeSemana() {
        return esFinDeSemana;
    }

    public void setEsFinDeSemana(Boolean esFinDeSemana) {
        this.esFinDeSemana = esFinDeSemana;
    }
}
