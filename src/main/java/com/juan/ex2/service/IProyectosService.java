package com.juan.ex2.service;

import java.util.List;

import com.juan.ex2.dto.Proyectos;

public interface IProyectosService {

	//All
	public List<Proyectos> listarProyectos();
	// UPDATE
	public Proyectos guardarProyecto(Proyectos proyecto); 
	// READ
	public Proyectos proyectoXID(int id);
	//DELETE
	public void eliminarProyecto(int id);
}
