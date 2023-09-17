package com.mx.cruddiscografia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.cruddiscografia.domain.Artista;
import com.mx.cruddiscografia.service.ArtistaService;

@Controller
@RequestMapping("/artista")
public class ArtistaController {

	@Autowired
	ArtistaService service;

	@GetMapping
	public String index(Model model) {
		var artistas = service.listarArtistas();
		model.addAttribute("artistas", artistas);
		return "index";
	}

	@GetMapping("/guardar")
	public String guardarGet(Artista artista) {
		return "guardar";
	}

	@PostMapping("/guardar")
	public String guardarPost(Artista artista) {
		return "redirect:/";
	}

	@GetMapping("/editar/{artistaId}")
	public String editar(Artista artista, Model model) {
		artista = service.buscarArtista(artista);
		model.addAttribute("artista", artista);
		return "editar";
	}

	@PostMapping("/editar")
	public String editar(Artista artista) {
		service.editarArtista(artista);
		return "redirect:/";
	}

	@GetMapping("/eliminar/{artistaId}")
	public String eliminar(Artista artista, Model model) {
		artista = service.buscarArtista(artista);
		model.addAttribute("artista", artista);
		return "eliminar";
	}

	@PostMapping("/eliminar")
	public String eliminar(Artista artista) {
		service.eliminarArtista(artista);
		return "redirect:/";
	}

}
