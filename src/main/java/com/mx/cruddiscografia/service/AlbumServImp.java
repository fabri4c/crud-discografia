package com.mx.cruddiscografia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.cruddiscografia.dao.AlbumDAO;
import com.mx.cruddiscografia.domain.Album;

@Service
public class AlbumServImp implements AlbumService {

	@Autowired
	AlbumDAO albumDAO;

	@Override
	public void guardarAlbum(Album album) {
		albumDAO.save(album);
	}

	@Override
	public void editarAlbum(Album album) {
		albumDAO.save(album);
	}

	@Override
	public void eliminarAlbum(Album album) {
		albumDAO.delete(album);
	}

	@Override
	public Album buscarAlbum(Album album) {
		return albumDAO.findById(album.getAlbumId()).orElse(null);
	}

	@Override
	public List<Album> listarAlbums() {
		return albumDAO.findAll(Sort.by(Sort.Direction.ASC, "albumId"));
	}

}
