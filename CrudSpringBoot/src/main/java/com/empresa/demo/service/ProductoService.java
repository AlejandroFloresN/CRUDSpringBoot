package com.empresa.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.demo.interfaceService.IProductoService;
import com.empresa.demo.interfaces.IProducto;
import com.empresa.demo.modelo.Producto;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int guardar(Producto p) {
		int res=0;
		Producto producto = data.save(p);
		if(!producto.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

}
