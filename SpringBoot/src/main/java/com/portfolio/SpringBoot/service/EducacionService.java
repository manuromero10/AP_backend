package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Educacion;
import com.portfolio.SpringBoot.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private IEducacionRepository educRep;

    @Override
    public List<Educacion> getEducacion() {
        return educRep.findAll(); 
    }
    

    @Override
    public void crearEducacion(Educacion edu) {
        educRep.save(edu);
    }

    @Override
    public void borrarEducacionById(Long id) {
        educRep.deleteById(id);
    }

    @Override
    public void editEducacion(Educacion edu) {
        educRep.save(edu);
    }

    @Override
    public Educacion buscarEducacionById(Long id) {
        return educRep.findById(id).orElse(null);
    }
    
    
    
    
    
}
