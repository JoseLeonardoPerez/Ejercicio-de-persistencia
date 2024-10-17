package edu.daeva.pelisdaeva;

import jakarta.persistence.*;

@Entity
//@Table(name = "resenia")
public class Resenia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String comentario;
    @Column
    private Integer calificacion;

//    private Pelicula pelicula;
}
