package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "\"TiposCuentas\"", schema = "core")
public class TipoCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"tipoCuentaId\"")
    private Integer tipoCuentaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"tasaInteresPorDefectoId\"")
    private TasaInteres tasaInteresPorDefecto;

    @Column(name = "\"nombre\"", length = 100, nullable = false)
    private String nombre;

    @Column(name = "\"descripcion\"", length = 120, nullable = false)
    private String descripcion;

    @Column(name = "\"requisitosApertura\"", length = 250, nullable = false)
    private String requisitosApertura;

    @Column(name = "\"fechaCreacion\"", nullable = false)
    private LocalDate fechaCreacion;

    @Column(name = "\"fechaModificacion\"", nullable = false)
    private LocalDate fechaModificacion;

    @Column(name = "\"estado\"", length = 10, nullable = false)
    private String estado;

    public TipoCuenta() {
    }

    public Integer getTipoCuentaId() {
        return tipoCuentaId;
    }

    public void setTipoCuentaId(Integer tipoCuentaId) {
        this.tipoCuentaId = tipoCuentaId;
    }

    public TasaInteres getTasaInteresPorDefecto() {
        return tasaInteresPorDefecto;
    }

    public void setTasaInteresPorDefecto(TasaInteres tasaInteresPorDefecto) {
        this.tasaInteresPorDefecto = tasaInteresPorDefecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRequisitosApertura() {
        return requisitosApertura;
    }

    public void setRequisitosApertura(String requisitosApertura) {
        this.requisitosApertura = requisitosApertura;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
