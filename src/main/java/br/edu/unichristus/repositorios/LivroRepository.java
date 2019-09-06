package br.edu.unichristus.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unichristus.entidades.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	

}
