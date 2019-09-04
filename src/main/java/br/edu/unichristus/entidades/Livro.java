package br.edu.unichristus.entidades;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TB_LIVROS")
@Data
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long livroID;

	private String titulo;

	private int numeroPaginas;

	private BigDecimal preco;

	public Livro(String titulo, int numeroPaginas, BigDecimal preco) {
		super();
		this.titulo = titulo;
		this.numeroPaginas = numeroPaginas;
		this.preco = preco;
	}

	public Livro() {

	}

	@Override
	public String toString() {
		return "Livro [livroID=" + livroID + ", titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + ", preco="
			+ preco + "]";
	}

	
}
