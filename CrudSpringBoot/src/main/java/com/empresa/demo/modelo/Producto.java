package com.empresa.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String descripcion;
	private double precio;
	private int cantidadStock;
	private int proveedorId;
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Producto(int id, String nombre, String descripcion, double precio, int cantidadStock, int proveedorId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
		this.proveedorId = proveedorId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantidadStock() {
		return cantidadStock;
	}


	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}


	public int getProveedorId() {
		return proveedorId;
	}


	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}
	
	
	
	

}
