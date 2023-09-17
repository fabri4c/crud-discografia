package com.mx.cruddiscografia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.cruddiscografia.domain.Cancion;

public interface CancionDAO extends JpaRepository<Cancion, Integer> {

}
