package com.empresa.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empresa.demo.modelo.proveedor;


@Repository
public interface IProveedor extends CrudRepository<proveedor, Integer> {
	
	 
}
