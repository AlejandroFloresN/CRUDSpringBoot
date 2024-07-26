package com.empresa.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.empresa.demo.modelo.Producto;
import com.empresa.demo.modelo.proveedor;

public interface IProveedorService {
	
	public List<proveedor>listar();
	public Optional<proveedor>listarId(int id);
	public int guardar(proveedor p);
	public void eliminar(int id);
}
