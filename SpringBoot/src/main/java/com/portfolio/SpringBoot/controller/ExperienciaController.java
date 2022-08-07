package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Experiencia;
import com.portfolio.SpringBoot.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    @GetMapping("/experiencia/lista")
    @ResponseBody
    public List<Experiencia> getExperiencia() {
        return expServ.getExperiencia();
    }
    
    @GetMapping("/experiencia/get/{id}")
    @ResponseBody
    public Experiencia buscarExperienciaById(@PathVariable Long id){
        return expServ.buscarExperienciaById(id);
    }
    
    @PostMapping ("/experiencia/new")
    public void agregarEducacion (@RequestBody Experiencia experiencia) {
        expServ.crearExperiencia(experiencia);
    }
    
    @PutMapping("/experiencia/edit")
    public void editExperiencia(@RequestBody Experiencia experiencia) {
        expServ.editExperiencia(experiencia);
   
    }
    
    @DeleteMapping ("/experiencia/delete/{id}")
    public void borrarExperienciaById (@PathVariable Long id) {
        expServ.borrarExperienciaById(id);
        
    }
}
