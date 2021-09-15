package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PeliculaDAO;
import com.example.demo.model.Pelicula;

@RestController
@RequestMapping("peliculas")
public class PeliculaRest {
	
	@Autowired
	private PeliculaDAO peliculaDAO;
	
	@GetMapping(path = "/movies")
	public List<Pelicula> characters(){
		return peliculaDAO.findAll();
	}
	
	@PostMapping(path = "/create")
	public void guardar(@RequestBody Pelicula Pelicula) {
		peliculaDAO.save(Pelicula);
	}
	
	@GetMapping(path = "/read/{id}")
	public Optional<Pelicula> read(@PathVariable("id") Integer id){
		return peliculaDAO.findById(id);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		peliculaDAO.deleteById(id);
	}
	
	@PutMapping(path = "/update")
	public void update(@RequestBody Pelicula Pelicula) {
		peliculaDAO.save(Pelicula);
	}
	
}