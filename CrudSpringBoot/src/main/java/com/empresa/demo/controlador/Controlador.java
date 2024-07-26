package com.empresa.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empresa.demo.interfaceService.IProductoService;
import com.empresa.demo.interfaceService.IProveedorService;
import com.empresa.demo.modelo.Producto;
import com.empresa.demo.modelo.proveedor;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IProveedorService serviceProveedor;
	@Autowired
	private IProductoService serviceProducto;

	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<proveedor> proveedores = serviceProveedor.listar();
		model.addAttribute("proveedor", proveedores);
		
		List<Producto> productos = serviceProducto.listar();
		model.addAttribute("producto", productos);
		
		return "index";
	}
	
	@GetMapping("/nuevoproveedor")
	public String agregar(Model model) {
		
		model.addAttribute("proveedor", new proveedor());
		return "formularioproveedor";
	}
	
	@PostMapping("/guardarproveedor")
	public String guardar(@Validated proveedor p, Model model) {
		
		serviceProveedor.guardar(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/nuevoproducto")
	public String agregarproducto(Model model) {
		
		model.addAttribute("producto", new Producto());
		return "formularioproducto";
	}
	
	@PostMapping("/guardarproducto")
	public String guardar(@Validated Producto p, Model model) {
		
		serviceProducto.guardar(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/editarproveedor/{id}")
	public String editarprov(@PathVariable int id, Model model) {
		Optional<proveedor>proveedor = serviceProveedor.listarId(id);
		model.addAttribute("proveedor", proveedor);
		
		return"formularioproveedor";
	}
	
	@GetMapping("/editarproducto/{id}")
	public String editarprod(@PathVariable int id, Model model) {
		Optional<Producto>producto = serviceProducto.listarId(id);
		model.addAttribute("producto", producto);
		
		return"formularioproducto";
	}
	
	@GetMapping("/eliminarproveedor/{id}")
	public String borrarprov(@PathVariable int id, Model model) {
		serviceProveedor.eliminar(id);
		
		return "redirect:/listar";
		
	}
	
	@GetMapping("/eliminarproducto/{id}")
	public String borrarprod(@PathVariable int id, Model model) {
		serviceProducto.eliminar(id);
		
		return "redirect:/listar";
		
	}
}
