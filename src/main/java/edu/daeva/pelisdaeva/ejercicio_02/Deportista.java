package edu.daeva.pelisdaeva.ejercicio_02;

import edu.daeva.pelisdaeva.ejercicio_02.motivaciones.Motivacion;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "deportista")
public class Deportista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    @OneToMany
    private List<String> contactos;

    @Column
    private Motivacion motivacionPrincipal;

    @Column
    private Double pesoInicialEnKilos;

    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public Deportista(){
        this.contactos = new ArrayList<>();
    }

}
