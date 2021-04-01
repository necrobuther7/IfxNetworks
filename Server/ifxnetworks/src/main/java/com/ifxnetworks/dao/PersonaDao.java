package com.ifxnetworks.dao;

import org.springframework.data.repository.CrudRepository;
import com.ifxnetworks.model.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{

}
