package com.tienda.dao;

import com.tienda.domain.Credito;
import org.springframework.data.jpa.repository.JpaRepository;

/*dao= data access object*/
public interface CreditoDao 
        extends JpaRepository<Credito, Long>{
    
}
