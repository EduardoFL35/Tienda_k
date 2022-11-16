package com.tienda.service;

import com.tienda.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    //Los métodos para hacer un CRUD de la tabla cliente
    //Create Read Update Delete
    
    public List<Cliente> getCliente();
    
    public Cliente getCliente(Cliente cliente);//Read
    
    public void save(Cliente cliente);//Update
    
    public void delete(Cliente cliente);//Delete

    public List<Cliente> buscarPorApellidos(String apellidos);
}
