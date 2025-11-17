package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "\"RepresentantesLegales\"", schema = "core")
public class RepresentanteLegal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"representanteLegalId\"")
    private Integer representanteLegalId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"empresaId\"", nullable = false)
    private Empresa empresa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"clienteId\"")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"personaId\"", nullable = false)
    private Persona persona;

    @Column(name = "\"rol\"", length = 25)
    private String rol;

    @Column(name = "\"fechaAsignacion\"", nullable = false)
    private LocalDateTime fechaAsignacion;

    @Column(name = "\"fechaDesvinculacion\"")
    private LocalDateTime fechaDesvinculacion;

    @Column(name = "\"estado\"", length = 10, nullable = false)
    private String estado;

    public RepresentanteLegal() {
    }

    public Integer getRepresentanteLegalId() {
        return representanteLegalId;
    }

    public void setRepresentanteLegalId(Integer representanteLegalId) {
        this.representanteLegalId = representanteLegalId;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDateTime getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public LocalDateTime getFechaDesvinculacion() {
        return fechaDesvinculacion;
    }

    public void setFechaDesvinculacion(LocalDateTime fechaDesvinculacion) {
        this.fechaDesvinculacion = fechaDesvinculacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
