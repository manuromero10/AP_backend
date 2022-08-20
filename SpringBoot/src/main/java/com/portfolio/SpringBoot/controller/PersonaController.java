package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Persona;
import com.portfolio.SpringBoot.service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping ("/persona/lista")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.getPersona();
    }
    
    @GetMapping("/persona/get/{id}")
    @ResponseBody
    public Persona buscarPersonaById(@PathVariable Long id){
        return persoServ.buscarPersonaById(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/persona/crear")
    public void agregarPersona (@RequestBody Persona per) {
        persoServ.crearPersona(per);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/edit")
    public void editEducacion(@RequestBody Persona per) {
        persoServ.editPersona(per);
   
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/persona/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersonaById(id);
        
    }
    
}
