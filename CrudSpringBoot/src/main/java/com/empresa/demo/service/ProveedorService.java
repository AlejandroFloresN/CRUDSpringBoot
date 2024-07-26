package com.empresa.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.demo.interfaceService.IProveedorService;
import com.empresa.demo.interfaces.IProveedor;
import com.empresa.demo.modelo.proveedor;

@Service
public class ProveedorService implements IProveedorService{

	@Autowired
	private IProveedor data;
	@Override
	public List<proveedor> listar() {
		// TODO Auto-generated method stub
		return (List<proveedor>)data.findAll();
	}

	@Override
	public Optional<proveedor> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int guardar(proveedor p) {
		int res=0;
		proveedor proveedor = data.save(p);
		if(!proveedor.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminar(int id) {
		data.deleteById(id);
		
	}
	
	
}
