package com.ifxnetworks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifxnetworks.dao.PersonaDao;
import com.ifxnetworks.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaDao personaDao;

	@Override
	public Persona get(long id) {
		return personaDao.findById(id).get();
	}

	@Override
	public List<Persona> getAll() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	public void post(Persona persona) {
		personaDao.save(persona);
	}

	@Override
	public void put(Persona persona, long id) {
		personaDao.findById(id).ifPresent((x)->{
			persona.setId(id);
			personaDao.save(persona);
		});
	}

	@Override
	public void delete(long id) {
		personaDao.deleteById(id);
	}

}
