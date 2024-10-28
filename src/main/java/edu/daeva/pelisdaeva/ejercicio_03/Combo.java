package edu.daeva.pelisdaeva.ejercicio_03;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("combo")
public class Combo extends Producto{
  @Getter
  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
          name = "combo_de_producto",
          joinColumns = @JoinColumns(name = "combo_id", referencedColimnName = "id")
          inverseJoinColumns = @JoinColumns(name = "producto_id", referencedColumnName = "id")
  )

  private List<Producto> productos;

  public Combo(){
      this.productos = new ArrayList<Producto>();
  }

  public void agregarProducto(Producto producto){
    this.productos.add(producto);
  }

  public Double precio(){
    return this.productos.stream().mapToDouble(p-> p.precio()).sum();
  }
}
