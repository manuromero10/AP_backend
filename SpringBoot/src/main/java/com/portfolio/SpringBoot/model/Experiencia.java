
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
@Table(name = "experiencia")

public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
            
    private Long id;
    
    @Basic
    private String puesto;
    private String inicio;
    private String fin;
    private String nombre_emp_lugar;
    private String url_logo;
    
    public Experiencia() {

    }

    public Experiencia(Long id, String puesto, String inicio, String fin, String nombre_emp_lugar, String url_logo) {
        this.id = id;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.nombre_emp_lugar = nombre_emp_lugar;
        this.url_logo = url_logo;
    }
    
}
