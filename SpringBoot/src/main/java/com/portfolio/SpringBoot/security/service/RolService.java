package com.portfolio.SpringBoot.security.service;

import com.portfolio.SpringBoot.security.enums.RolNombre;
import com.portfolio.SpringBoot.security.model.Rol;
import com.portfolio.SpringBoot.security.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class RolService {
    
    @Autowired
    IRolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    
        return rolRepository.findByRolNombre(rolNombre);
    }
    

}
