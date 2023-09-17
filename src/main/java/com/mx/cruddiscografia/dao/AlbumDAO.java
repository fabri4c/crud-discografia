package com.mx.cruddiscografia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.cruddiscografia.domain.Album;

public interface AlbumDAO extends JpaRepository<Album, Integer> {

}
