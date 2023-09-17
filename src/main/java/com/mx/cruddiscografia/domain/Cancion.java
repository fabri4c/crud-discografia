package com.mx.cruddiscografia.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "canciones")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cancion {

	@Id
	@SequenceGenerator(name = "cancion_sequence", sequenceName = "seq_cancion_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cancion_sequence")
	@Column(name = "cancion_id")
	private int cancionId;

	@Column
	private String titulo;

	@Column
	private float duracion;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "album_id")
	@JsonBackReference
	private Album album;

}
