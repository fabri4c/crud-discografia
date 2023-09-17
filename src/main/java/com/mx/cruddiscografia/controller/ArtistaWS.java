package com.mx.cruddiscografia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.cruddiscografia.domain.Artista;
import com.mx.cruddiscografia.service.ArtistaService;

@RestController
@RequestMapping("/api/artista")
@CrossOrigin(origins = "http://localhost:5173")
public class ArtistaWS {

	@Autowired
	ArtistaService service;

	@PostMapping("guardar")
	public void guardarArtista(@RequestBody Artista artista) {
		service.guardarArtista(artista);
	}

	@PostMapping("editar")
	public void editarArtista(@RequestBody Artista artista) {
		service.editarArtista(artista);
	}

	@PostMapping("eliminar")
	public void eliminarArtista(@RequestBody Artista artista) {
		service.eliminarArtista(artista);
	}

	@PostMapping("buscar")
	public Artista buscarArtista(@RequestBody Artista artista) {
		return service.buscarArtista(artista);
	}

	@GetMapping("listar")
	public List<Artista> listaArtistas() {
		return service.listarArtistas();
	}

}
