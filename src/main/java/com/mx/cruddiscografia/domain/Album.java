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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "albums")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Album {

	@Id
	@SequenceGenerator(name = "album_sequence", sequenceName = "seq_album_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "album_sequence")
	@Column(name = "album_id")
	private int albumId;

	@Column
	private String titulo;

	@Column
	private Date fechaLanzamiento;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "artista_id")
	@JsonBackReference
	private Artista artista;

	@OneToMany(mappedBy = "album", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("album")
	private List<Cancion> canciones = new ArrayList<>();

}
