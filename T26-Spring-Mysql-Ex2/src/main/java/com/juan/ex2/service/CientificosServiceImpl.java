package com.juan.ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex2.dao.ICientificosDAO;
import com.juan.ex2.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService {
	
	@Autowired ICientificosDAO icientificosDAO;
	
	@Override
	public List<Cientificos> listarCientificos() {
		// TODO Auto-generated method stub
		return icientificosDAO.findAll();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return icientificosDAO.save(cientifico);
	}

	@Override
	public Cientificos cientificosXID(int id) {
		// TODO Auto-generated method stub
		return icientificosDAO.findById(id).get();
	}

	@Override
	public void eliminarCientificos(int id) {
		// TODO Auto-generated method stub
		icientificosDAO.deleteById(id);
		
	}

}
