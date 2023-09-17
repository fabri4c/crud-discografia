package com.mx.cruddiscografia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.cruddiscografia.domain.Album;
import com.mx.cruddiscografia.service.AlbumService;

@RestController
@RequestMapping("/api/album")
@CrossOrigin
public class AlbumWS {

	@Autowired
	AlbumService service;

	@PostMapping("guardar")
	public void guardarAlbum(@RequestBody Album album) {
		service.guardarAlbum(album);
	}

	@PostMapping("editar")
	public void editarAlbum(@RequestBody Album album) {
		service.editarAlbum(album);
	}

	@PostMapping("eliminar")
	public void eliminarAlbum(@RequestBody Album album) {
		service.eliminarAlbum(album);
	}

	@PostMapping("buscar")
	public Album buscarAlbum(@RequestBody Album album) {
		return service.buscarAlbum(album);
	}

	@GetMapping("listar")
	public List<Album> listaAlbums() {
		return service.listarAlbums();
	}

}
