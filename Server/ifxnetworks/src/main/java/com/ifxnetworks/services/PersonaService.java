package com.ifxnetworks.services;

import java.util.*;
import com.ifxnetworks.model.Persona;

public interface PersonaService {
	public Persona get(long id);
	public List<Persona> getAll();
	public void post(Persona persona);
	public void put(Persona persona, long id);
	public void delete(long id);
	
}
