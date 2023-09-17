package com.mx.cruddiscografia.service;

import java.util.List;

import com.mx.cruddiscografia.domain.Artista;

public interface ArtistaService {

	void guardarArtista(Artista artista);

	void editarArtista(Artista artista);

	void eliminarArtista(Artista artista);

	Artista buscarArtista(Artista artista);

	List<Artista> listarArtistas();

}
