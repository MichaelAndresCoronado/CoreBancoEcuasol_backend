package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class PersonaRequestDTO {

    @NotBlank
    @Size(max = 10)
    private String tipoIdentificacion;

    @NotBlank
    @Size(max = 20)
    private String numeroIdentificacion;

    @NotBlank
    @Size(max = 120)
    private String nombres;

    @NotBlank
    @Size(max = 120)
    private String apellidos;

    @NotBlank
    @Size(max = 20)
    private String genero;

    @Size(max = 20)
    private String estadoCivil;

    @Email
    @Size(max = 120)
    private String correoElectronico;

    @NotNull
    private LocalDate fechaNacimiento;

    @NotBlank
    @Size(max = 15)
    private String telefono;

    @NotBlank
    @Size(max = 255)
    private String direccion;

    @NotBlank
    @Size(max = 10)
    private String estado;
}
