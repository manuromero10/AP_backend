
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
@Table(name = "persona")


public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    
    private Long id;
    
    @Basic
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String email;
    private String ocupacion;
    private String sobre_mi;
    private String url_foto;
    
    
    public Persona () {
    }
    
    public Persona(Long id, String nombre, String apellido, String fechaNac, String email, String ocupacion, String sobre_mi, String url_foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.email = email;
        this.ocupacion = ocupacion;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
    }
    
}
