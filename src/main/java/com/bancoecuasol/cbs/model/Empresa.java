package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"Empresas\"", schema = "core")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"empresaId\"")
    private Integer empresaId;

    @Column(name = "\"tipoIdentificacion\"", length = 10, nullable = false)
    private String tipoIdentificacion;

    @Column(name = "\"numeroIdentificacion\"", length = 13, nullable = false)
    private String numeroIdentificacion;

    @Column(name = "\"razonSocial\"", length = 120, nullable = false)
    private String razonSocial;

    @Column(name = "\"nombreComercial\"", length = 120)
    private String nombreComercial;

    @Column(name = "\"correoElectronico\"", length = 120, nullable = false)
    private String correoElectronico;

    @Column(name = "\"sectorEconomico\"", length = 20)
    private String sectorEconomico;

    @Column(name = "\"telefono\"", length = 15, nullable = false)
    private String telefono;

    @Column(name = "\"direccion\"", length = 200, nullable = false)
    private String direccion;

    @Column(name = "\"fechaConstitucion\"")
    private LocalDate fechaConstitucion;

    @Column(name = "\"fechaRegistro\"", nullable = false)
    private LocalDateTime fechaRegistro;

    @Column(name = "\"fechaModificacion\"", nullable = false)
    private LocalDateTime fechaModificacion;

    @Column(name = "\"estado\"", length = 10)
    private String estado;

    public Empresa() {
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
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

    public LocalDate getFechaConstitucion() {
        return fechaConstitucion;
    }

    public void setFechaConstitucion(LocalDate fechaConstitucion) {
        this.fechaConstitucion = fechaConstitucion;
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
