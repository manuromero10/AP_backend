package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion, Long> {
    
}
