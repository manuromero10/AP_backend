package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository <Habilidad, Long> {
    
}
