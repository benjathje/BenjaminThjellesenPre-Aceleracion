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

import com.example.demo.dao.PersonajeDAO;
import com.example.demo.model.Personaje;

@RestController
@RequestMapping("personajes")
public class PersonajeRest {
	
	@Autowired
	private PersonajeDAO personajeDAO;
	
	@GetMapping(path = "/characters")
	public List<Personaje> characters(){
		return personajeDAO.findAll();
	}
	
	@PostMapping(path = "/create")
	public void guardar(@RequestBody Personaje personaje) {
		personajeDAO.save(personaje);
	}
	
	@GetMapping(path = "/listartodo")
	public List<Personaje> listartodo(){
		return personajeDAO.findAll();
	}
	
	@GetMapping(path = "/read/{id}")
	public Optional<Personaje> read(@PathVariable("id") Integer id){
		return personajeDAO.findById(id);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		personajeDAO.deleteById(id);
	}
	
	@PutMapping(path = "/update")
	public void update(@RequestBody Personaje personaje) {
		personajeDAO.save(personaje);
	}

}
