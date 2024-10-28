package edu.daeva.pelisdaeva.ejercicio_02;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_ejercicio")
public class Ejercicio {

    @Column
    private String nombre;

    @Column
    private String detalle;
}
