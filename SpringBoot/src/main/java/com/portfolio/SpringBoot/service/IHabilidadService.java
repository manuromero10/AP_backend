package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    public List <Habilidad> getHabilidad();
    public void crearHabilidad(Habilidad hab);
    public void borrarHabilidadById (Long id);
    public void editHabilidad(Habilidad hab);
    public Habilidad buscarHabilidadById (Long id);
    
}
