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

import com.example.demo.dao.SerieDAO;
import com.example.demo.model.Serie;

@RestController
@RequestMapping("series")
public class SerieRest {
	
	@Autowired
	private SerieDAO SerieDAO;
	
	@GetMapping(path = "/series")
	public List<Serie> characters(){
		return SerieDAO.findAll();
	}
	
	@PostMapping(path = "/create")
	public void guardar(@RequestBody Serie Serie) {
		SerieDAO.save(Serie);
	}
	
	@GetMapping(path = "/read/{id}")
	public Optional<Serie> read(@PathVariable("id") Integer id){
		return SerieDAO.findById(id);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		SerieDAO.deleteById(id);
	}
	
	@PutMapping(path = "/update")
	public void update(@RequestBody Serie Serie) {
		SerieDAO.save(Serie);
	}
	
}