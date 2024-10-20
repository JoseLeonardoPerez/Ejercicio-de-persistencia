package edu.daeva.pelisdaeva.ejercicio2;


import edu.daeva.pelisdaeva.ejercicio2.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Jugador {
  private String nombre;
  private String apellido;
  private LocalDate fechaAlta;
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
