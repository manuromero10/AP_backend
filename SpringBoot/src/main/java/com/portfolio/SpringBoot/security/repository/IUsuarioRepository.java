
package com.portfolio.SpringBoot.security.repository;

import com.portfolio.SpringBoot.security.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {
    
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);   

    public boolean existsByNombreUsuario(String nombreUsuario);
    
}
