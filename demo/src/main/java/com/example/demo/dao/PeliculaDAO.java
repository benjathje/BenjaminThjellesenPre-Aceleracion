package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pelicula;

public interface PeliculaDAO extends JpaRepository<Pelicula, Integer>{

}
