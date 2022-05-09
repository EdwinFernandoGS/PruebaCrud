package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository pR;
	
	public List<Persona> listar(){
		return (List<Persona>) pR.findAll();
	}
	
	public Optional<Persona> listarId(int id){
		return pR.findById(id);
	}
	
	public Persona guardar(Persona p) {
		return pR.save(p);
	}
	
	public void eliminar(int id) {
		pR.deleteById(id);
	}
}
