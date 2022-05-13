package com.example.demo.restapi;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.PersonaService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/api/persona/")
public class PersonaRest {
	
	
	@Autowired
	private PersonaService pS;
	
	@PostMapping
	private Mono<Persona> guardarPersona(@RequestBody Persona p){
		return  pS.guardar(p);
		
	}
	@GetMapping
	private Flux<Persona> listarPersona (){
		return pS.listar();
	}
	
	
	@DeleteMapping(value = "{id}")
    public void borrarPersona(@PathVariable Integer id) {
		pS.borrarPersona(id);
		  
            
    }
	
	@GetMapping(value = "{id}")
	private Mono<Persona> listarPersonaPorId (@PathVariable ("id") Integer id){
		return pS.listarId(id);
	}
	
	
	
}
