package com.juan.ex2.service;

import java.util.List;

import com.juan.ex2.dto.AsignadoA;

public interface IAsignadoAService {

	//ALL 
	public List<AsignadoA> listarAsignadoA();
	//UPDATE
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA);
	// READ
	public AsignadoA AsignadoAXID(int id);
	//DELETE
	public void eliminarAsignadoA(int id);
}
