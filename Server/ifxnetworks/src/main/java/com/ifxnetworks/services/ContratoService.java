package com.ifxnetworks.services;

import java.util.*;
import com.ifxnetworks.model.Contrato;

public interface ContratoService {
	public Contrato get(long id);
	public List<Contrato> getAll();
	public void post(Contrato contrato);
	public void put(Contrato contrato, long id);
	public void delete(long id);
}