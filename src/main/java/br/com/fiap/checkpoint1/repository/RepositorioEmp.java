package br.com.fiap.checkpoint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.checkpoint1.bancoDados.Empregado;

@Repository
public interface RepositorioEmp extends JpaRepository<Empregado, Long> {

}
