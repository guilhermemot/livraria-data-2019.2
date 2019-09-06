package br.edu.unichristus.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unichristus.entidades.Livro;
import br.edu.unichristus.repositorios.LivroRepository;

@RestController
@RequestMapping("/")
public class LivroController {
	@Autowired
	private LivroRepository repoLivro;

	@GetMapping("/todos")
	public List<Livro> buscarTodos() {
		return repoLivro.findAll();
	}

	@GetMapping("/livro/{id}")
	public Livro buscarPeloID(@PathVariable Long id) {
		return repoLivro.findById(id).get();
	}

	@PostMapping("/novo")
	public Livro salvar(@ModelAttribute Livro livro) {
		return repoLivro.save(livro);
	}
}
