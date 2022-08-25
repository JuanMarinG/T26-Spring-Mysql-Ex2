package com.juan.ex2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.ex2.dto.AsignadoA;
import com.juan.ex2.service.AsignadoAServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoAController {
	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;
	
	@GetMapping("/asignado")
	public List<AsignadoA> listarAsignadoA(){
		return asignadoAServiceImpl.listarAsignadoA();
	}
	
	
	@PostMapping("/asignado")
	public AsignadoA guardarAsignadoA(@RequestBody AsignadoA AsignadoA) {
		return asignadoAServiceImpl.guardarAsignadoA(AsignadoA);
	}
	
	
	@GetMapping("/asignado/{id}")
	public AsignadoA asignadoAXID(@PathVariable(name="id") int id) {
		return asignadoAServiceImpl.AsignadoAXID(id);
	}
	
	@PutMapping("/asignado/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")int id,@RequestBody AsignadoA AsignadoA) {
		
		AsignadoA Asig_selec=asignadoAServiceImpl.AsignadoAXID(id);		
		
		Asig_selec.setCientifico(AsignadoA.getCientifico());
		Asig_selec.setProyecto(AsignadoA.getProyecto());
		
		return asignadoAServiceImpl.guardarAsignadoA(Asig_selec);
	}
	
	@DeleteMapping("/asignado/{id}")
	public void eliminarAsignadoA(@PathVariable(name="id")int id) {
		asignadoAServiceImpl.eliminarAsignadoA(id);
	}
}
