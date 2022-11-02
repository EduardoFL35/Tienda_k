package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")//Cuál tabla va a mapear
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id//Para mapear el ID de la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    Long idCategoria;
    private String descripcion;
    private boolean activo;
    
    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
  
    
}
