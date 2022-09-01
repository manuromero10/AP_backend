package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Habilidad;
import com.portfolio.SpringBoot.repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HabilidadService implements IHabilidadService{
    
    @Autowired
    private IHabilidadRepository habRep;

    @Override
    public List<Habilidad> getHabilidad() {
        return habRep.findAll(); 
    }
    

    @Override
    public void crearHabilidad(Habilidad hab) {
        habRep.save(hab);
    }

    @Override
    public void borrarHabilidadById(Long id) {
        habRep.deleteById(id);
    }

    @Override
    public void editHabilidad(Habilidad hab) {
        habRep.save(hab);
    }

    @Override
    public Habilidad buscarHabilidadById(Long id) {
        return habRep.findById(id).orElse(null);
    }
       
}