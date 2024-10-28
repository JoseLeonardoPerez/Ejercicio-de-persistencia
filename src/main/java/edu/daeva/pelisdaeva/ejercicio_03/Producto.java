package edu.daeva.pelisdaeva.ejercicio_03;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity @Table(name = "producto")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_producto")
@Embeddable
public abstract class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
  private String nombre;

    @Column
  private Marca marca;

  public Producto() {

  }

  public Double precio() {

      return 0.0;
  }

  public Integer stock() {

      return 0;
  }
}
