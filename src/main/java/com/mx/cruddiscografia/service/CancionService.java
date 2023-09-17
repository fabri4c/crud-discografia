package com.mx.cruddiscografia.service;

import java.util.List;

import com.mx.cruddiscografia.domain.Cancion;

public interface CancionService {

	void guardarCancion(Cancion cancion);

	void editarCancion(Cancion cancion);

	void eliminarCancion(Cancion cancion);

	Cancion buscarCancion(Cancion cancion);

	List<Cancion> listarCanciones();

}
