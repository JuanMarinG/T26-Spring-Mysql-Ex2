package com.juan.ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex2.dao.IProyectosDAO;
import com.juan.ex2.dto.Proyectos;

@Service
public class ProyectosServiceImpl implements IProyectosService {

	@Autowired
	IProyectosDAO iProyectosDAO;

	@Override
	public List<Proyectos> listarProyectos() {
		// TODO Auto-generated method stub
		return iProyectosDAO.findAll();
	}

	@Override
	public Proyectos guardarProyecto(Proyectos proyecto) {
		// TODO Auto-generated method stub
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public Proyectos proyectoXID(int id) {
		// TODO Auto-generated method stub
		return iProyectosDAO.findById(id).get();
	}

	@Override
	public void eliminarProyecto(int id) {
		// TODO Auto-generated method stub
		iProyectosDAO.deleteById(id);
	}
	
	
	
}
