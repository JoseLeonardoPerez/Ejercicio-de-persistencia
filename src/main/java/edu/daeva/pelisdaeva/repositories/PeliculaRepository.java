package edu.daeva.pelisdaeva.repositories;

import edu.daeva.pelisdaeva.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    Pelicula findByNombre(String nombre);
    Pelicula findByDuracionEnMinutos(Integer nombre);
}
