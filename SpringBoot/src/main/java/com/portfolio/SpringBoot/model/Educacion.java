
package com.portfolio.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter  @Setter
@Entity
@Table (name = "educacion")

public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
            
    private Long id;
    
    @Basic
    private String titulo;
    private String inicio;
    private String fin;
    private String lugar;
    private String url_logo;
    
   
    
    public Educacion() {

    }

    public Educacion(Long id, String titulo, String inicio, String fin, String lugar, String url_logo) {
        this.id = id;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.lugar = lugar;
        this.url_logo = url_logo;
    }
    
}
