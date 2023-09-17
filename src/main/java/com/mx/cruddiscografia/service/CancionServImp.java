package com.mx.cruddiscografia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.mx.cruddiscografia.dao.CancionDAO;
import com.mx.cruddiscografia.domain.Cancion;

public class CancionServImp implements CancionService {

	@Autowired
	CancionDAO cancionDAO;

	@Override
	public void guardarCancion(Cancion cancion) {
		cancionDAO.save(cancion);
	}

	@Override
	public void editarCancion(Cancion cancion) {
		cancionDAO.save(cancion);
	}

	@Override
	public void eliminarCancion(Cancion cancion) {
		cancionDAO.delete(cancion);
	}

	@Override
	public Cancion buscarCancion(Cancion cancion) {
		return cancionDAO.findById(cancion.getCancionId()).orElse(null);
	}

	@Override
	public List<Cancion> listarCanciones() {
		return cancionDAO.findAll(Sort.by(Sort.Direction.ASC, "cancionId"));
	}

}
