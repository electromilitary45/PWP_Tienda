package com.Tienda.domain;

//---------IMPORTS-----------
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


//-----anotaciones
@Data
@Entity
//para enlazar la tabla que vamos a usar
@Table(name="credito")

public class Credito implements Serializable{
    
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")
    private Long idCredito;
    
    private Double limite;

    
    public Credito() {
    }
    
    public Credito(Double limite) {
        this.limite = limite;
    }


    
}
