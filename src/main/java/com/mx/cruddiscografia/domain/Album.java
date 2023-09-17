package com.mx.cruddiscografia.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "artistas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Album {

	@Id
	@SequenceGenerator(name = "artista_sequence", sequenceName = "artista_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artista_sequence")
	@Column
	private int albumId;

	@Column
	private String nombre;

	@Column
	private Date fechaLanzamiento;

	@ManyToOne
	@JoinColumn(name = "artista_id")
	@JsonBackReference
	private Artista artista;

}
