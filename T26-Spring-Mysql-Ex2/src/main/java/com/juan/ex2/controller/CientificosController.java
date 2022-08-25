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

import com.juan.ex2.dto.Cientificos;
import com.juan.ex2.service.CientificosServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificosController {

	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cientificosServiceImpl.listarCientificos();
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientificos cientificoXID(@PathVariable(name="id") int id) {
		return cientificosServiceImpl.cientificosXID(id);
	}
	
	@PostMapping("/cientificos")
	public Cientificos salvarCientifico(@RequestBody Cientificos cientifico) {
		return cientificosServiceImpl.guardarCientifico(cientifico);
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientificos actualizarCientificos(@PathVariable(name="id")int id,@RequestBody Cientificos cientifico) {
		
		Cientificos cient_selec=cientificosServiceImpl.cientificosXID(id);
		
		cient_selec.setNomApels(cientifico.getNomApels());
		cient_selec.setAsignadoA(cientifico.getAsignadoA());		
		
		return cientificosServiceImpl.guardarCientifico(cient_selec);
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eliminarCientifico(@PathVariable(name="dni")int id) {
		cientificosServiceImpl.eliminarCientificos(id);
	}
}
