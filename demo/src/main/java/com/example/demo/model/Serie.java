package com.example.demo.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Serie {
	@Id
	private Integer id;
	
	@Column
	private String imagen;
	
	@Column
	private String titulo;
	
	@Column
	private LocalDate fechacreacion;
	
	@Column
	private Integer calificacion;
	
	@ManyToMany
	Set<Personaje> personajes;
	
	@ManyToMany
	Set<Genero> generos;

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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDate getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(LocalDate fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public Integer getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}
	public Set<Personaje> getPersonajes() {
		return personajes;
	}
	public void setPersonajes(Set<Personaje> personajes) {
		this.personajes = personajes;
	}
	public Set<Genero> getGeneros() {
		return generos;
	}
	public void setGeneros(Set<Genero> generos) {
		this.generos = generos;
	}
	

}
