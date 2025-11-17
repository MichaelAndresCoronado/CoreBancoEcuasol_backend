package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "\"EntidadesBancarias\"", schema = "administrativos")
public class EntidadBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"entidadBancariaId\"")
    private Integer entidadBancariaId;

    @Column(name = "\"ruc\"", length = 20, nullable = false)
    private String ruc;

    @Column(name = "\"razonSocial\"", length = 200, nullable = false)
    private String razonSocial;

    @Column(name = "\"nombreComercial\"", length = 200)
    private String nombreComercial;

    @Column(name = "\"sitioWeb\"", length = 200)
    private String sitioWeb;

    @Column(name = "\"emailContacto\"", length = 120)
    private String emailContacto;

    @Column(name = "\"codigoInternacional\"", length = 20)
    private String codigoInternacional;

    public EntidadBancaria() {
    }

    public Integer getEntidadBancariaId() {
        return entidadBancariaId;
    }

    public void setEntidadBancariaId(Integer entidadBancariaId) {
        this.entidadBancariaId = entidadBancariaId;
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
