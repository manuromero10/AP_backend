package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    public List <Usuario> getUsuario();
    public void crearUsuario(Usuario usu);
    public void borrarUsuarioById (Long id);
    public void editUsuario(Usuario usu);
    public Usuario buscarUsuarioById (Long id);
    
}
