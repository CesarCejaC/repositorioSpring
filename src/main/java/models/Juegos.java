package models;

import javax.persistence.*;

@Entity
@Table(name = "juegos")
public class Juegos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_juego;

    @Column(name = "nombre_juego", nullable = false)
    private String nombre_juego;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public Juegos() {
    }

    public Juegos(Long id_juego, String nombre_juego, String descripcion) {
        super();
        this.id_juego = id_juego;
        this.nombre_juego = nombre_juego;
        this.descripcion = descripcion;
    }

    public Long getId_juego() {
        return id_juego;
    }

    public void setId_juego(Long id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
