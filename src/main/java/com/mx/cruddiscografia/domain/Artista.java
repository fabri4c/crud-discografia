package com.mx.cruddiscografia.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
	@SequenceGenerator(name = "artista_sequence", sequenceName = "artista_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artista_sequence")
	@Column
	private int artistaId;

	@Column
	private String nombre;

	@Column
	private Date fechaNacimiento;

	@Column
	private String nacionalidad;

	@OneToMany(mappedBy = "artista")
	private List<Album> albums;

}
