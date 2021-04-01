package com.ifxnetworks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifxnetworks.model.Cargo;
import com.ifxnetworks.model.Persona;
import com.ifxnetworks.services.PersonaService;

@RestController
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/personas")
	public List<Persona> getAllPersonas(){
		return personaService.getAll();
	}
	
	@GetMapping("/persona/{id}")
	public Persona getOne(@PathVariable(value="id") long id) {
		return personaService.get(id);
	}
	
	@PostMapping("/persona")
	public void add(Persona persona) {
		personaService.post(persona);
	}
	
	
	@PutMapping("/persona/{id}")
	public void update(Persona persona, @PathVariable(value="id") long id) {
		personaService.put(persona, id);
	}
	
	@DeleteMapping("persona/{id}")
	public void delete(@PathVariable(value="id") long id) {
		personaService.delete(id);
	}

}
