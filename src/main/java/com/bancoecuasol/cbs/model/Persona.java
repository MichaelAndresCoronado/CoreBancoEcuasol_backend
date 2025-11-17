package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"Personas\"", schema = "core")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"personaId\"")
    private Integer personaId;

    @Column(name = "\"tipoIdentificacion\"", length = 10, nullable = false)
    private String tipoIdentificacion;

    @Column(name = "\"numeroIdentificacion\"", length = 13, nullable = false)
    private String numeroIdentificacion;

    @Column(name = "\"nombres\"", length = 120, nullable = false)
    private String nombres;

    @Column(name = "\"apellidos\"", length = 120, nullable = false)
    private String apellidos;

    @Column(name = "\"genero\"", length = 15, nullable = false)
    private String genero;

    @Column(name = "\"estadoCivil\"", length = 15, nullable = false)
    private String estadoCivil;

    @Column(name = "\"correoElectronico\"", length = 120, nullable = false)
    private String correoElectronico;

    @Column(name = "\"fechaNacimiento\"", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "\"telefono\"", length = 15, nullable = false)
    private String telefono;

    @Column(name = "\"direccion\"", length = 200, nullable = false)
    private String direccion;

    @Column(name = "\"fechaRegistro\"", nullable = false)
    private LocalDateTime fechaRegistro;

    @Column(name = "\"fechaModificacion\"", nullable = false)
    private LocalDateTime fechaModificacion;

    @Column(name = "\"estado\"", length = 10)
    private String estado;

    public Persona() {
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
