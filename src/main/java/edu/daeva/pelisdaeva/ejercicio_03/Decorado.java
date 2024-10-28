package edu.daeva.pelisdaeva.ejercicio_03;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("decorado")
@Inheritance(Strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "tipo")
public abstract class Decorado extends Producto{

  @Column(name = "producto")
  protected Producto producto;

  public Double precio() {
    return this.producto.precio();
  }


}
