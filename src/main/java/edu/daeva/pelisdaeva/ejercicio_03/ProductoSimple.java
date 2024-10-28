package edu.daeva.pelisdaeva.ejercicio_03;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity @DiscriminatorValue("producto simple")
public class ProductoSimple extends Producto{

  @Column(name = "precio")
  private Double precio;

  @Column(name = "stock")
  private Integer stock;

  public Double precio() {
    return this.precio;
  }

  public Integer stock() {
    return this.stock;
  }

  public ProductoSimple() {

  }

}
