package edu.daeva.pelisdaeva.ejercicio_03;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("packaging")
public class Packaging extends Decorado{

  @Column
  private Double precio;

  //* ----------------- CONSTRUCTORS ----------------- *//

  public Packaging() {
  }

  public Packaging(Double precio) {
      this.precio = precio;
  }

  //* ----------------- METHODS ----------------- *//

  public Double precio() {
    return this.producto.precio() + this.precio;
  }

}
