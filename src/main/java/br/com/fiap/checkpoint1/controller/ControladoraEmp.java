package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.bancoDados.Empregado;
import br.com.fiap.checkpoint1.servicos.ServicosEmp;

@RestController
@RequestMapping("/empregados")
public class ControladoraEmp {

	@Autowired
	ServicosEmp servEmp;
	
	@GetMapping
	public List<Empregado> get(){
		return servEmp.get();
	}
	
	@PutMapping
	public Empregado put(Empregado empregado) {
		return servEmp.put(empregado);
	}

	@PostMapping
	public Empregado post(Empregado empregado) {
		return servEmp.post(empregado);
	}



}

