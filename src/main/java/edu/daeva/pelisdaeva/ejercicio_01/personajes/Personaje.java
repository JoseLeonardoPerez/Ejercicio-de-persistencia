package edu.daeva.pelisdaeva.ejercicio_01.personajes;


import edu.daeva.pelisdaeva.ejercicio_01.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

  @Getter
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  private Integer estamina;

  @Getter @Setter
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
