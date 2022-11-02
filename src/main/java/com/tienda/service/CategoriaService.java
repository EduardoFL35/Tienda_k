package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Los métodos para hacer un CRUD de la tabla categoria
    //Create Read Update Delete
    
    public List<Categoria> getCategoria();
    
    //si es true
    public Categoria getCategoria(boolean activos);//Read
    
    public void save(Categoria categoria);//Update
    
    public void delete(Categoria categoria);//Delete
}
