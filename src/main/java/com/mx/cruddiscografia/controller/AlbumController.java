package com.mx.cruddiscografia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.cruddiscografia.domain.Album;
import com.mx.cruddiscografia.service.AlbumService;

@Controller
@RequestMapping("/album")
public class AlbumController {

	@Autowired
	AlbumService service;

	@GetMapping
	public String index(Model model) {
		var albums = service.listarAlbums();
		model.addAttribute("albums", albums);
		return "index";
	}

	@GetMapping("/guardar")
	public String guardarGet(Album album) {
		return "guardar";
	}

	@PostMapping("/guardar")
	public String guardarPost(Album album) {
		service.guardarAlbum(album);
		return "redirect:/";
	}

	@GetMapping("/editar/{albumId}")
	public String editar(Album album, Model model) {
		album = service.buscarAlbum(album);
		model.addAttribute("album", album);
		return "editar";
	}

	@PostMapping("/editar")
	public String editar(Album album) {
		service.editarAlbum(album);
		return "redirect:/";
	}

	@GetMapping("/eliminar/{albumId}")
	public String eliminar(Album album, Model model) {
		album = service.buscarAlbum(album);
		model.addAttribute("album", album);
		return "eliminar";
	}

	@PostMapping("/eliminar")
	public String eliminar(Album album) {
		service.eliminarAlbum(album);
		return "redirect:/";
	}

}
