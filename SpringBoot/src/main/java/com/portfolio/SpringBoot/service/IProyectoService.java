package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public List <Proyecto> getProyecto();
    public void crearProyecto(Proyecto proyecto);
    public void borrarProyectoById (Long id);
    public void editProyecto (Proyecto proyecto);
    public Proyecto buscarProyectoById (Long id);
    
}
