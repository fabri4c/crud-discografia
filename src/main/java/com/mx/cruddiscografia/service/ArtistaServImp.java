package com.mx.cruddiscografia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.cruddiscografia.dao.ArtistaDAO;
import com.mx.cruddiscografia.domain.Artista;

@Service
public class ArtistaServImp implements ArtistaService {

	@Autowired
	ArtistaDAO artistaDAO;

	@Override
	public void guardarArtista(Artista artista) {
		artistaDAO.save(artista);
	}

	@Override
	public void editarArtista(Artista artista) {
		artistaDAO.save(artista);
	}

	@Override
	public void eliminarArtista(Artista artista) {
		artistaDAO.delete(artista);
	}

	@Override
	public Artista buscarArtista(Artista artista) {
		return artistaDAO.findById(artista.getArtistaId()).orElse(null);
	}

	@Override
	public List<Artista> listarArtistas() {
		return artistaDAO.findAll(Sort.by(Sort.Direction.ASC, "artistaId"));
	}

}
