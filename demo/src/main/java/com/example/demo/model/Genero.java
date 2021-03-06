package com.example.demo.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Genero {
	@Id
	private Integer id;
	
	@Column
	private String nombre;
	
	@Column
	private String imagen;
	
	@ManyToMany
	Set<Pelicula> peliculas;
	
	@ManyToMany
	Set<Serie> series;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	public Set<Serie> getSeries() {
		return series;
	}
	public void setSeries(Set<Serie> series) {
		this.series = series;
	}

}
