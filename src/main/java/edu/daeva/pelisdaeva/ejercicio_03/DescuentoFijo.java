package edu.daeva.pelisdaeva.ejercicio_03;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity @DiscriminatorValue("decorado")
public class DescuentoFijo extends Decorado {

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "valor")
  private Double valor;

  public Double precio() {
    return this.producto.precio() - this.valor;
  }

  public DescuentoFijo() {

  }
}
