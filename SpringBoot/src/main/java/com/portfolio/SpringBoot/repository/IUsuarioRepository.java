package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Long> {
    
}
