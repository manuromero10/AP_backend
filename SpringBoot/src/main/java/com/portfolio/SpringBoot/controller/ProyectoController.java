package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Proyecto;
import com.portfolio.SpringBoot.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyServ;
    
    @GetMapping("/proyecto/lista")
    @ResponseBody
    public List<Proyecto> getProyecto() {
        return proyServ.getProyecto();
    }
    
    @GetMapping("/proyecto/get/{id}")
    @ResponseBody
    public Proyecto buscarProyectoById(@PathVariable Long id){
        return proyServ.buscarProyectoById(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/proyecto/new")
    public void agregarProyecto (@RequestBody Proyecto proyecto) {
        proyServ.crearProyecto(proyecto);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyecto/edit")
    public void editProyecto(@RequestBody Proyecto proyecto) {
        proyServ.editProyecto(proyecto);
   
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/proyecto/delete/{id}")
    public void borrarProyectoById (@PathVariable Long id) {
        proyServ.borrarProyectoById(id);
        
    }
    
}
