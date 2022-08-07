package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public List <Educacion> getEducacion();
    public void crearEducacion(Educacion edu);
    public void borrarEducacionById (Long id);
    public void editEducacion(Educacion edu);
    public Educacion buscarEducacionById (Long id);
    
}
