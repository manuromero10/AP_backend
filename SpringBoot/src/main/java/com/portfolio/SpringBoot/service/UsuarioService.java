package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.model.Usuario;
import com.portfolio.SpringBoot.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    private IUsuarioRepository usuRep;

    @Override
    public List<Usuario> getUsuario() {
        return usuRep.findAll(); 
    }

    @Override
    public void crearUsuario(Usuario usu) {
        usuRep.save(usu);
    }

    @Override
    public void borrarUsuarioById(Long id) {
        usuRep.deleteById(id);
    }

    @Override
    public void editUsuario(Usuario usu) {
        usuRep.save(usu);
    }

    @Override
    public Usuario buscarUsuarioById(Long id) {
        return usuRep.findById(id).orElse(null);
    }
    
}
