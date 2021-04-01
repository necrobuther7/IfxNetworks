package com.ifxnetworks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifxnetworks.model.Persona;
import com.ifxnetworks.model.Contrato;
import com.ifxnetworks.services.ContratoService;

@RestController
public class ContratoController {
	
	@Autowired
	ContratoService contratoService;
	
	@GetMapping("/contratos")
	public List<Contrato> getAllEntidads(){
		return contratoService.getAll();
	}
	
	@GetMapping("/contrato/{id}")
	public Contrato getOne(@PathVariable(value="id") long id) {
		return contratoService.get(id);
	}
	
	@PostMapping("/contrato")
	public void add(Contrato contrato) {
		contratoService.post(contrato);
	}
	
	@PutMapping("/contrato/{id}")
	public void update(Contrato contrato, @PathVariable(value="id") long id) {
		contratoService.put(contrato, id);
	}
	
	@DeleteMapping("contrato/{id}")
	public void delete(@PathVariable(value="id") long id) {
		contratoService.delete(id);
	}

}
