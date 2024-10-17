package edu.daeva.pelisdaeva;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pelicula")
@Getter
@Setter
@NoArgsConstructor
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Transient
    private Director director;

    @ManyToMany
    @JoinTable(
            name = "pelicula_x_genero",
            joinColumns = @JoinColumn(name = "pelicula_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id", referencedColumnName = "id")
    )
    private List<Genero> genero;
    private Integer duracionEnMinutos;

    @Transient
    private List<Actor> actores;

    @Transient
    private List<Premio> premiosGanados;

    @OneToMany(mappedBy = "pelicula")
    private List<Resenia> resenias;
}
