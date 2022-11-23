package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Los métodos para hacer un CRUD de la tabla categoria
    //Create Read Update Delete
    
    public List<Categoria> getCategorias(boolean activos);
    
    //si es true
    public Categoria getCategoria(Categoria categoria);//Read
    
    public void save(Categoria categoria);//Update
    
    public void delete(Categoria categoria);//Delete
}
