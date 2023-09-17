package com.mx.cruddiscografia.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "artistas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Artista {

	@Id
	@SequenceGenerator(name = "artista_sequence", sequenceName = "seq_artista_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artista_sequence")
	@Column(name = "artista_id")
	private int artistaId;

	@Column
	private String nombre;

	@Column
	private Date fechaNacimiento;

	@Column
	private String nacionalidad;

	@OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("artista")
	private List<Album> albums = new ArrayList<>();

}
