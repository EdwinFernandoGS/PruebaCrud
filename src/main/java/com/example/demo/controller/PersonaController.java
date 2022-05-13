package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Persona;

import com.example.demo.repository.PersonaRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/api/persona2/")
public class PersonaController {
	
	@Autowired
	PersonaRepository personaRepository;
	
	public PersonaController() {
		this.personaRepository = null;
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	private Flux<Persona> getAllPersona() {
		return personaRepository.findAll();
	}

	
	
	
	
	
}
