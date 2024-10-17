package edu.daeva.pelisdaeva;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Table(name = "resenia")
@Getter
@Setter
@NoArgsConstructor
public class Resenia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String comentario;
    @Column
    private Integer calificacion;

    @ManyToOne
    private Pelicula pelicula;

}
