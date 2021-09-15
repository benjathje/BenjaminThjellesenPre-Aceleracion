package com.example.demo.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Personaje {
	@Id
	private Integer id;
	
	@Column
	private String imagen;
	
	@Column
	private String nombre;
	
	@Column
	private Integer edad;
	
	@Column
	private Integer peso;
	
	@Column
	private String historia;
	
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
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
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
