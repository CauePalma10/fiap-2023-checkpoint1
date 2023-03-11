package br.com.fiap.checkpoint1.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.bancoDados.Empregado;
import br.com.fiap.checkpoint1.repository.RepositorioEmp;

@Service
public class ServicosEmp {

	@Autowired
	RepositorioEmp repEmp;
	
	public List<Empregado> get(){
		return repEmp.findAll();
	}
	
	public Empregado put(Empregado empregado) {
		return repEmp.save(empregado);
	}
	
	public Empregado post(Empregado empregado) {
		return repEmp.save(empregado);
 
	}
}
