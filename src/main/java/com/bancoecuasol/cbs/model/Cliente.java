package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"Clientes\"", schema = "core")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"clienteId\"")
    private Integer clienteId;

    @Column(name = "\"tipoEntidadId\"", nullable = false)
    private Integer tipoEntidadId; // 1=Persona, 2=Empresa

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"entidadBancariaId\"", nullable = false)
    private EntidadBancaria entidadBancaria;

    @Column(name = "\"nombre\"", length = 120, nullable = false)
    private String nombre;

    @Column(name = "\"usuario\"", length = 60, nullable = false)
    private String usuario;

    @Column(name = "\"hashPassword\"", length = 255, nullable = false)
    private String hashPassword;

    @Column(name = "\"emailRecuperacion\"", length = 120)
    private String emailRecuperacion;

    @Column(name = "\"tipoIdentificacion\"", length = 10, nullable = false)
    private String tipoIdentificacion;

    @Column(name = "\"numeroIdentificacion\"", length = 13, nullable = false)
    private String numeroIdentificacion;

    @Column(name = "\"fechaRegistro\"", nullable = false)
    private LocalDateTime fechaRegistro;

    @Column(name = "\"fechaModificacion\"", nullable = false)
    private LocalDateTime fechaModificacion;

    @Column(name = "\"estado\"", length = 10, nullable = false)
    private String estado;

    public Cliente() {
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getTipoEntidadId() {
        return tipoEntidadId;
    }

    public void setTipoEntidadId(Integer tipoEntidadId) {
        this.tipoEntidadId = tipoEntidadId;
    }

    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getEmailRecuperacion() {
        return emailRecuperacion;
    }

    public void setEmailRecuperacion(String emailRecuperacion) {
        this.emailRecuperacion = emailRecuperacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
