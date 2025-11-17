package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "\"JerarquiasGeograficas\"", schema = "administrativos")
public class JerarquiaGeografica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"jerarquiaId\"")
    private Integer jerarquiaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"paisId\"", nullable = false)
    private Pais pais;

    @Column(name = "\"nombreNivel\"", length = 50, nullable = false)
    private String nombreNivel;

    @Column(name = "\"nivel\"", nullable = false)
    private Integer nivel;

    public JerarquiaGeografica() {
    }

    public Integer getJerarquiaId() {
        return jerarquiaId;
    }

    public void setJerarquiaId(Integer jerarquiaId) {
        this.jerarquiaId = jerarquiaId;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
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
