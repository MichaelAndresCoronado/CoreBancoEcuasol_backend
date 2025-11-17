package com.bancoecuasol.cbs.api.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class DiaFeriadoRequestDTO {

    @NotNull
    private LocalDate fecha;

    @NotBlank
    @Size(max = 255)
    private String descripcion;

    @NotNull
    private Boolean esFinDeSemana;

    private Integer paisId;

    private Integer localizacionGeograficaId;
}
