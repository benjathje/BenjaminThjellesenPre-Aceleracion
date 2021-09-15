package com.example.demo.rest;

import java.util.List;

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
	
	@PostMapping(path = "/guardar")
	public void guardar(@RequestBody Personaje personaje) {
		personajeDAO.save(personaje);
	}
	
	@GetMapping(path = "/listartodo")
	public List<Personaje> listartodo(){
		return personajeDAO.findAll();
	}
	
	@DeleteMapping(path = "/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		personajeDAO.deleteById(id);
	}
	
	@PutMapping(path = "/actualizar")
	public void actualizar(@RequestBody Personaje personaje) {
		personajeDAO.save(personaje);
	}

}
