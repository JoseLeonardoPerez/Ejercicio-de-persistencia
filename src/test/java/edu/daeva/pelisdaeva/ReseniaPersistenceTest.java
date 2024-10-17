package edu.daeva.pelisdaeva;

import edu.daeva.pelisdaeva.repositories.PeliculaRepository;
import edu.daeva.pelisdaeva.repositories.ReseniaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class ReseniaPersistenceTest {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Autowired
    private ReseniaRepository reseniaRepository;

    @Test
    void sePuedeCrearUnaPelicula() {
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Star Wars");

        Resenia resenia = new Resenia();
        resenia.setPelicula(pelicula);
        resenia.setCalificacion(10);

        peliculaRepository.save(pelicula);

        assertEquals("Star Wars", peliculaRepository.findByNombre("Star Wars").getNombre());
    }
}
