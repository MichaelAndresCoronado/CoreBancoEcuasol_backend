package com.bancoecuasol.cbs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Entity
@Table(name = "\"LocalizacionesGeograficas\"", schema = "administrativos")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class LocalizacionGeografica {

    /**
     * Identificador interno de la localizacion geografica.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"localizacionGeograficaId\"")
    private Integer localizacionGeograficaId;

    /**
     * Nombre de la localizacion geografica.
     */
    @Column(name = "\"nombre\"", nullable = false, length = 120)
    private String nombre;

    /**
     * Codigo interno o oficial de la localizacion.
     */
    @Column(name = "\"codigo\"", length = 30)
    private String codigo;

    /**
     * Jerarquia geografica a la que pertenece.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"jerarquiaId\"", nullable = false)
    private JerarquiaGeografica jerarquia;

    /**
     * Localizacion padre. Puede ser nulo.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"parentLocalizacionGeograficaId\"")
    private LocalizacionGeografica parentLocalizacionGeografica;

    /**
     * Constructor solo para la clave primaria.
     */
    public LocalizacionGeografica(Integer localizacionGeograficaId) {
        this.localizacionGeograficaId = localizacionGeograficaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalizacionGeografica that = (LocalizacionGeografica) o;
        return Objects.equals(localizacionGeograficaId, that.localizacionGeograficaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localizacionGeograficaId);
    }
}
