package br.edu.unichristus;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.unichristus.entidades.Livro;
import br.edu.unichristus.repositorios.LivroRepository;

@SpringBootApplication
public class LivrariaDataApplication implements CommandLineRunner {

	@Autowired
	private LivroRepository repoLivros;
	
	public static void main(String[] args) {
		SpringApplication.run(LivrariaDataApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	// limpa o repositório
	repoLivros.deleteAll();
	// salva alguns livros
	repoLivros.save(new Livro("Java Como Programar", 999, new BigDecimal(99.00)));
	repoLivros.save(new Livro("Spring Data", 123, new BigDecimal(55.00)));
	repoLivros.save(new Livro("Spring Framework 5.0", 490, new BigDecimal(125.00)));
	// obtêm todos os livros
	System.out.println("obtendo os livros...");
	System.out.println("-------------------------");
	repoLivros.findAll().stream().forEach(System.out::println);
	}

}
