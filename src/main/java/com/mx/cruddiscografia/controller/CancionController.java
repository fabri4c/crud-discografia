package com.mx.cruddiscografia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.cruddiscografia.domain.Cancion;
import com.mx.cruddiscografia.service.CancionService;

@Controller
@RequestMapping("/cancion")
public class CancionController {

	@Autowired
	CancionService service;

	@GetMapping
	public String index(Model model) {
		var canciones = service.listarCanciones();
		model.addAttribute("canciones", canciones);
		return "index";
	}

	@GetMapping("/guardar")
	public String guardarCancionGet(Cancion cancion) {
		return "guardar";
	}

	@PostMapping("/guardar")
	public String guardarCancionPost(Cancion cancion) {
		service.guardarCancion(cancion);
		return "redirect:/";
	}

	@GetMapping("/editar/{cancionId}")
	public String editarCancion(Cancion cancion, Model model) {
		cancion = service.buscarCancion(cancion);
		model.addAttribute("bioma", cancion);
		return "editar";
	}

	@PostMapping("/editar")
	public String editarCancion(Cancion cancion) {
		service.editarCancion(cancion);
		return "redirect:/";
	}

	@GetMapping("/eliminar/{cancionId}")
	public String eliminarCancion(Cancion cancion, Model model) {
		cancion = service.buscarCancion(cancion);
		model.addAttribute("bioma", cancion);
		return "eliminar";
	}

	@PostMapping("/eliminar")
	public String eliminarCancion(Cancion cancion) {
		service.eliminarCancion(cancion);
		return "redirect:/";
	}

}
