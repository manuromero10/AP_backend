package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProyectoRepository extends JpaRepository <Proyecto, Long> {
    
}
