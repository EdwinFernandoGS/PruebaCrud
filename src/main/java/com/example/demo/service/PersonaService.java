package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository pR;
	
	public Flux<Persona> listar(){
		return pR.findAll();
	}
	
	public Mono<Persona> listarId(int id){
		return pR.findById(id);
	}
	
	public Mono<Persona> guardar(Persona p) {
		return pR.save(p);
	}
	
    public Mono<Void> borrarPersona(int id) {
		return pR.deleteById(id);
       
    }
}
