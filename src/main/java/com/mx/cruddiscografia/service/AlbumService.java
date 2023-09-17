package com.mx.cruddiscografia.service;

import java.util.List;

import com.mx.cruddiscografia.domain.Album;

public interface AlbumService {

	void guardarAlbum(Album album);

	void editarAlbum(Album album);

	void eliminarAlbum(Album album);

	Album buscarAlbum(Album album);

	List<Album> listarAlbums();

}
