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
public class Rutina {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Deportista deportista;

    @Column
    @ManyToMany(Cascade = CascadeType.ALL)
    @JoinTable(
            name = "rutina_x_dia_entrenamiento",
            JoinColumns = @JoinColumns(name = "diadeentrenamiento_id", referencedColumnName = "id")
            inverseJoinColumns = @JoinColumns(name= "ejercicio_id", referencedColumnName = "id")
    )
    private List<DiaDeEntrenamiento> diasDeEntrenamiento;

    @Column
    private Rutina rutinaAnterior;

    public Rutina() {
        this.diasDeEntrenamiento = new ArrayList<>();
    }

    public void agregarDiaDeEntrenamiento(DiaDeEntrenamiento diaDeEntrenamiento) {
        this.diasDeEntrenamiento.add(diaDeEntrenamiento);
    }
}
