package com.empresa.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empresa.demo.modelo.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer> {
	
	 
}