package com.juan.ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex2.dao.IAsignadoADAO;
import com.juan.ex2.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl implements IAsignadoAService{

	@Autowired IAsignadoADAO iAsignadoADAO;
	
	@Override
	public List<AsignadoA> listarAsignadoA() {
		// TODO Auto-generated method stub
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignadoA) {
		// TODO Auto-generated method stub
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public AsignadoA AsignadoAXID(int id) {
		// TODO Auto-generated method stub
		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public void eliminarAsignadoA(int id) {
		// TODO Auto-generated method stub
		iAsignadoADAO.deleteById(id);
	}

}
