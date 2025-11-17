package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Paises\"", schema = "administrativos")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"paisId\"")
    private Integer paisId;

    @Column(name = "\"nombre\"", length = 100, nullable = false)
    private String nombre;

    @Column(name = "\"isoAlpha2\"", length = 2, nullable = false)
    private String isoAlpha2;

    @Column(name = "\"isoAlpha3\"", length = 3)
    private String isoAlpha3;

    @Column(name = "\"codigoNumerico\"", length = 4)
    private String codigoNumerico;

    public Pais() {
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
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
