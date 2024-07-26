function eliminar(id) {
		Swal.fire({
		  title: "¿Estas seguro de elimnar?",
		  text: "No podras revertir esta accion!",
		  icon: "Cuidado!",
		  showCancelButton: true,
		  confirmButtonColor: "#3085d6",
		  cancelButtonColor: "#d33",
		  confirmButtonText: "Si, borrar!"
		}).then((OK) => {
		  if (OK) {
			$.ajax({
				url:"/eliminarproveedor/"+id,
				success: function(res) {
					console.log(res);
				},
			});
		    Swal.fire({
		      title: "Borrado!",
		      text: "El proveedor seleccionado ha sido borrado.",
		      icon: "success"
		    }).then((ok)=>{
				location.href="/listar";
			});
		  }
		});
	}
	
	Swal.fire({
	  title: "¿Estas seguro de elimnar?",
	  text: "No podras revertir esta accion!",
	  icon: "Cuidado!",
	  showCancelButton: true,
	  confirmButtonColor: "#3085d6",
	  cancelButtonColor: "#d33",
	  confirmButtonText: "Si, borrar!"
	}).then((OK) => {
	  if (OK) {
		$.ajax({
			url:"/eliminarproducto/"+id,
			success: function(res) {
				console.log(res);
			},
		});
	    Swal.fire({
	      title: "Borrado!",
	      text: "El producto seleccionado ha sido borrados.",
	      icon: "success"
	    }).then((ok)=>{
			location.href="/listar";
		});
	  }
	});
}