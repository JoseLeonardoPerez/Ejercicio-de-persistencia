package edu.daeva.pelisdaeva.ejercicio_02;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(Strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dia_de entrenamiento")
public class DiaDeEntrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "ejercicio_x_dia",
            JoinColumns = @JoinColumns(name = "diadeentrenamiento_id", referencedColumnName = "id")
            inverseJoinColumns = @JoinColumns(name= "ejercicio_id", referencedColumnName = "id")
    )
    private List<Ejercicio> ejercicios;

    @Column
    private Integer numero; // representa el orden en la duracion de la rutina.

    @Column
    private DiaDeEntrenamiento siguienteDia;

    public DiaDeEntrenamiento() {
        this.ejercicios = new ArrayList<>();
    }
    public void agregarEjercicio(Ejercicio ejercicio) {
        this.ejercicios.add(ejercicio);
    }
}
