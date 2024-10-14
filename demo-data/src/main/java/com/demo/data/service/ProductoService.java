package com.demo.data.service;


import java.util.List;
import java.util.Optional;

import com.demo.data.entity.Producto;

public interface ProductoService {
	
    List<Producto> getAllProductos();
    
    Optional<Producto> getProductoById(Long id);
    
    Producto createProducto(Producto producto);
    
    Producto updateProducto(Long id, Producto productoDetails);
    
    void deleteProducto(Long id);
}