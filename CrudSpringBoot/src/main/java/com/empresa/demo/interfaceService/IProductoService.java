package com.empresa.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.empresa.demo.modelo.Producto;

public interface IProductoService {
	
	public List<Producto>listar();
	public Optional<Producto>listarId(int id);
	public int guardar(Producto p);
	public void eliminar(int id);
}
