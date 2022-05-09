package com.example.demo.restapi;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.PersonaService;

@RestController
@RequestMapping(value="/api/persona/")
public class PersonaRest {
	
	
	@Autowired
	private PersonaService pS;
	
	@PostMapping
	private ResponseEntity<Persona> guardarPersona(@RequestBody Persona p){
		Persona temp = pS.guardar(p);
		try {
			return ResponseEntity.created(new URI("/api/persona/"+temp.getId())).body(temp); 
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).build();
		}
	}
	@GetMapping
	private ResponseEntity<List<Persona>> listarPersona (){
		return ResponseEntity.ok(pS.listar());
	}
	
	@DeleteMapping(value = "{id}")
	private ResponseEntity<Void> eliminarPersona (@PathVariable ("id") Integer id){
		pS.eliminar(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<Persona>> listarPersonaPorId (@PathVariable ("id") Integer id){
		return ResponseEntity.ok(pS.listarId(id));
	}
	
	
	
}
