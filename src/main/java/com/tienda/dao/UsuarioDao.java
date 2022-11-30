package com.tienda.dao;


import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/*dao= data access object*/
public interface UsuarioDao 
        extends JpaRepository<Usuario, Long>{
    
    //Consultas ampliadas de JPA
    public Usuario findByUsername(String username);
    
}
