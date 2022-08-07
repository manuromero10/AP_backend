
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
@Table (name ="usuario")


public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
            
    private Long id;
    
    @Basic
    private String email;
    private String password;
    
    
    public Usuario() {

    }

    public Usuario(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
 
    }
}
