package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List <Experiencia> getExperiencia();
    public void crearExperiencia(Experiencia experiencia);
    public void borrarExperienciaById (Long id);
    public void editExperiencia(Experiencia experiencia);
    public Experiencia buscarExperienciaById(Long id);
    
}
