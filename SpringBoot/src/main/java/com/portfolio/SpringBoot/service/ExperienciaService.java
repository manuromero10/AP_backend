package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Experiencia;
import com.portfolio.SpringBoot.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    private IExperienciaRepository expRep;

    @Override
    public List<Experiencia> getExperiencia() {
        return expRep.findAll(); 
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
        expRep.save(experiencia);
    }

    @Override
    public void borrarExperienciaById(Long id) {
        expRep.deleteById(id);
    }

    @Override
    public void editExperiencia(Experiencia experiencia) {
        expRep.save(experiencia);
    }

    @Override
    public Experiencia buscarExperienciaById(Long id) {
        return expRep.findById(id).orElse(null);
    }

    
}
