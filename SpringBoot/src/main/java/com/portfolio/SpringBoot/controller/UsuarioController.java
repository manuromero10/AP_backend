package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.model.Usuario;
import com.portfolio.SpringBoot.service.IUsuarioService;
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
public class UsuarioController {
    @Autowired
    private IUsuarioService usuServ;
    
    @GetMapping("/usuario/lista")
    @ResponseBody
    public List<Usuario> getUsuario() {
        return usuServ.getUsuario();
    }
    
    @GetMapping("/usuario/get/{id}")
    @ResponseBody
    public Usuario buscarUsuarioById(@PathVariable Long id){
        return usuServ.buscarUsuarioById(id);
    }
    
    @PostMapping ("/usuario/new")
    public void agregarUsuario (@RequestBody Usuario usuario) {
        usuServ.crearUsuario(usuario);
    }
    
    @PutMapping("/usuario/edit")
    public void editUsuario(@RequestBody Usuario usuario) {
        usuServ.editUsuario(usuario);
   
    }
    
    @DeleteMapping ("/usuario/delete/{id}")
    public void borrarUsuarioById (@PathVariable Long id) {
        usuServ.borrarUsuarioById(id);
        
    }
    
}
