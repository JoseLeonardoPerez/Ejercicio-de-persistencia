//package edu.daeva.pelisdaeva;
//
//import com.peliculas.festivalpeliculas.repositorios.PeliculaRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//
//@SpringBootTest
//@ActiveProfiles("test")
//public class PeliculaPersistenceTest {
//
//    @Autowired
//    private PeliculaRepository peliculaRepository;
//
//    @Test
//    void sePuedeGuardarUnaPelicula() {
//        Director director = new Director();
//        director.setNombre("George");
//        director.setApellido("Lucas");
//
//        Pelicula pelicula = new Pelicula();
//        pelicula.setNombre("Star wars");
//        pelicula.setDirector(director);
//
//        peliculaRepository.save(pelicula);
//
//        assertEquals("Star wars", peliculaRepository.findByNombre("Star wars").getNombre());
//        assertEquals("Star wars", peliculaRepository.findByDirector_Nombre("George").getNombre());
//    }
//}
