package com.ifxnetworks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifxnetworks.dao.ContratoDao;
import com.ifxnetworks.model.Contrato;

@Service
public class ContratoServiceImpl implements ContratoService {
	
	@Autowired
	private ContratoDao entidadDao;

	@Override
	public Contrato get(long id) {
		return entidadDao.findById(id).get();
	}

	@Override
	public List<Contrato> getAll() {
		return (List<Contrato>) entidadDao.findAll();
	}

	@Override
	public void post(Contrato entidad) {
		entidadDao.save(entidad);
	}

	@Override
	public void put(Contrato entidad, long id) {
		entidadDao.findById(id).ifPresent((x)->{
			entidad.setId(id);
			entidadDao.save(entidad);
		});
	}

	@Override
	public void delete(long id) {
		entidadDao.deleteById(id);
	}

}