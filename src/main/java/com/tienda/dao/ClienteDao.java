package com.tienda.dao;

import com.tienda.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/*dao= data access object*/
public interface ClienteDao 
        extends JpaRepository<Cliente, Long>{
    
}
