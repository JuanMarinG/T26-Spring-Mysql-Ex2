package com.juan.ex2.service;

import java.util.List;

import com.juan.ex2.dto.Cientificos;

public interface ICientificosService {

	//All
	public List<Cientificos> listarCientificos(); 
	//UPDATE
	public Cientificos guardarCientifico(Cientificos cientifico); 
	
	// READ
	public Cientificos cientificosXID(int id); 
	// DELETE
	public void eliminarCientificos(int id);
}
