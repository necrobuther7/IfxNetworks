package com.ifxnetworks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifxnetworks.dao.CargoDao;
import com.ifxnetworks.model.Cargo;

@Service
public class CargoServiceImpl implements CargoService {
	
	@Autowired
	private CargoDao cargoDao;

	@Override
	public Cargo get(long id) {
		return cargoDao.findById(id).get();
	}

	@Override
	public List<Cargo> getAll() {
		return (List<Cargo>) cargoDao.findAll();
	}

	@Override
	public void post(Cargo cargo) {
		cargoDao.save(cargo);
	}

	@Override
	public void put(Cargo cargo, long id) {
		cargoDao.findById(id).ifPresent((x)->{
			cargo.setId(id);
			cargoDao.save(cargo);
		});
	}

	@Override
	public void delete(long id) {
		cargoDao.deleteById(id);
	}

}