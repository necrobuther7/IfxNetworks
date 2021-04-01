package com.ifxnetworks.services;

import java.util.*;
import com.ifxnetworks.model.Cargo;

public interface CargoService {
	public Cargo get(long id);
	public List<Cargo> getAll();
	public void post(Cargo cargo);
	public void put(Cargo cargo, long id);
	public void delete(long id);
}