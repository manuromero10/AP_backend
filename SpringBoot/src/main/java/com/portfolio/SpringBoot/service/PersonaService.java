package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public IPersonaRepository persoRep;

    @Override
    public List<Persona> getPersona() {
         return persoRep.findAll();        
    }

    @Override
    public void crearPersona(Persona per) {
        persoRep.save(per);
    }

    @Override
    public void borrarPersonaById(Long id) {
        persoRep.deleteById(id);
    }

    @Override
    public void editPersona(Persona per) {
        persoRep.save(per);
    }

    @Override
    public Persona buscarPersonaById(Long id) {
        return persoRep.findById(id).orElse(null);
    }
    
}
