
package com.portfolio.SpringBoot.security.repository;

import com.portfolio.SpringBoot.security.enums.RolNombre;
import com.portfolio.SpringBoot.security.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
