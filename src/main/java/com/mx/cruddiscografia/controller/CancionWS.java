package com.mx.cruddiscografia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.cruddiscografia.domain.Cancion;
import com.mx.cruddiscografia.service.CancionService;

@RestController
@RequestMapping("/api/cancion")
@CrossOrigin
public class CancionWS {

	@Autowired
	CancionService service;

	@PostMapping("guardar")
	public void guardarCancion(@RequestBody Cancion cancion) {
		service.guardarCancion(cancion);
	}

	@PostMapping("editar")
	public void editarCancion(@RequestBody Cancion cancion) {
		service.editarCancion(cancion);
	}

	@PostMapping("eliminar")
	public void eliminarCancion(@RequestBody Cancion cancion) {
		service.eliminarCancion(cancion);
	}

	@PostMapping("buscar")
	public Cancion buscarCancion(@RequestBody Cancion cancion) {
		return service.buscarCancion(cancion);
	}

	@GetMapping("listar")
	public List<Cancion> listaCanciones() {
		return service.listarCanciones();
	}

}
