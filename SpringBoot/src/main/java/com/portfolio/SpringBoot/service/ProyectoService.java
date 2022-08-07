package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Proyecto;
import com.portfolio.SpringBoot.repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    private IProyectoRepository proyRep;

    @Override
    public List<Proyecto> getProyecto() {
        return proyRep.findAll(); 
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyRep.save(proyecto);
    }

    @Override
    public void borrarProyectoById(Long id) {
         proyRep.deleteById(id);
    }

    @Override
    public void editProyecto(Proyecto proyecto) {
        proyRep.save(proyecto);
    }

    @Override
    public Proyecto buscarProyectoById(Long id) {
        return proyRep.findById(id).orElse(null);
    }
    
}
