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
import com.ifxnetworks.services.CargoService;

@RestController
public class CargoController {
	
	@Autowired
	CargoService cargoService;
	
	@GetMapping("/cargos")
	public List<Cargo> getAllTipoCargos(){
		return cargoService.getAll();
	}
	
	@GetMapping("/cargo/{id}")
	public Cargo getOne(@PathVariable(value="id") long id) {
		return cargoService.get(id);
	}
	
	@PostMapping("/cargo")
	public void add(Cargo cargo) {
		cargoService.post(cargo);
	}
	
	@PutMapping("/cargo/{id}")
	public void update(Cargo cargo, @PathVariable(value="id") long id) {
		cargoService.put(cargo, id);
	}
	
	@DeleteMapping("cargo/{id}")
	public void delete(@PathVariable(value="id") long id) {
		cargoService.delete(id);
	}

}