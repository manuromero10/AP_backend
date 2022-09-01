package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Habilidad;
import com.portfolio.SpringBoot.service.IHabilidadService;
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
public class HabilidadController {
    
    @Autowired
    private IHabilidadService habServ;
    
    @GetMapping("/habilidad/lista")
    @ResponseBody
    public List<Habilidad> getHabilidad() {
        return habServ.getHabilidad();
    }
    
    @GetMapping("/habilidad/get/{id}")
    @ResponseBody
    public Habilidad buscarHabilidadById(@PathVariable Long id){
        return habServ.buscarHabilidadById(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/habilidad/new")
    public void agregarHabilidad (@RequestBody Habilidad habilidad) {
        habServ.crearHabilidad(habilidad);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/habilidad/edit")
    public void editHabilidad(@RequestBody Habilidad habilidad) {
        habServ.editHabilidad(habilidad);
   
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/habilidad/delete/{id}")
    public void borrarHabilidadById (@PathVariable Long id) {
        habServ.borrarHabilidadById(id);
        
    }
    
}
