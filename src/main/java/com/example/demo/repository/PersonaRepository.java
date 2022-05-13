package com.example.demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.demo.model.Persona;

public interface PersonaRepository extends ReactiveCrudRepository<Persona, Integer>{

}
