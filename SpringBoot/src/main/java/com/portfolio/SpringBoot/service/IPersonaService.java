package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List <Persona> getPersona();
    public void crearPersona(Persona per);
    public void borrarPersonaById (Long id);
    public void editPersona (Persona per);
    public Persona buscarPersonaById (Long id);
    
}