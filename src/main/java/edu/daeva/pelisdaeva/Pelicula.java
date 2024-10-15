package edu.daeva.pelisdaeva;

import lombok.Getter;

import java.util.List;

@Getter
public class Pelicula {
    private Long id;
    private String nombre;
    private Director director;
    private List<Genero> genero;
    private Integer duracionEnMinutos;
    private List<Actor> actores;
    private List<Premio> premiosGanados;
}
