
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
@Table(name = "proyecto")


public class Proyecto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    private Long id;
    
    @Basic
    private String nombre;
    private String fecha;
    private String descripcion;
    private String url_imagen;
    private String url_proyecto;
    
    public Proyecto() {

    }

    public Proyecto(Long id, String nombre, String fecha, String descripcion, String url_imagen, String url_proyecto) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.url_imagen = url_imagen;
        this.url_proyecto = url_proyecto;
    }
    
}
