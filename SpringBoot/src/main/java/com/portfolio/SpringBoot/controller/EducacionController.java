package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Educacion;
import com.portfolio.SpringBoot.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping("/educacion/lista")
    @ResponseBody
    public List<Educacion> getEducacion() {
        return eduServ.getEducacion();
    }
    
    @GetMapping("/educacion/get/{id}")
    @ResponseBody
    public Educacion buscarEducacionById(@PathVariable Long id){
        return eduServ.buscarEducacionById(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/educacion/new")
    public void agregarEducacion (@RequestBody Educacion educacion) {
        eduServ.crearEducacion(educacion);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/educacion/edit")
    public void editEducacion(@RequestBody Educacion educacion) {
        eduServ.editEducacion(educacion);
   
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/educacion/delete/{id}")
    public void borrarEducacionById (@PathVariable Long id) {
        eduServ.borrarEducacionById(id);
        
    }
    
}
