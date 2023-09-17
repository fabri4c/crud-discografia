package com.mx.cruddiscografia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.cruddiscografia.domain.Artista;

public interface ArtistaDAO extends JpaRepository<Artista, Integer> {

}
