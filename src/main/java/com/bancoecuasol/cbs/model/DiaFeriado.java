package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "\"DiasFeriados\"", schema = "administrativos")
public class DiaFeriado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"feriadoId\"")
    private Integer feriadoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"paisId\"", nullable = false)
    private Pais pais;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"localizacionGeograficaId\"")
    private LocalizacionGeografica localizacionGeografica;

    @Column(name = "\"fecha\"", nullable = false)
    private LocalDate fecha;

    @Column(name = "\"descripcion\"", length = 200, nullable = false)
    private String descripcion;

    @Column(name = "\"esFinDeSemana\"", nullable = false)
    private Boolean esFinDeSemana;

    public DiaFeriado() {
    }

    public Integer getFeriadoId() {
        return feriadoId;
    }

    public void setFeriadoId(Integer feriadoId) {
        this.feriadoId = feriadoId;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public LocalizacionGeografica getLocalizacionGeografica() {
        return localizacionGeografica;
    }

    public void setLocalizacionGeografica(LocalizacionGeografica localizacionGeografica) {
        this.localizacionGeografica = localizacionGeografica;
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
