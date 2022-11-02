package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "credito")//Cuál tabla va a mapear
public class Credito implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id//Para mapear el ID de la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")//Para decir que la columna de la base de datos es id_credito
    private Long idCredito;
    
    private double limite;

    public Credito() {
    }

    public Credito(double limite) {
        this.limite = limite;
    }


}
