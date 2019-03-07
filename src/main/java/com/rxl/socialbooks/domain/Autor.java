package com.rxl.socialbooks.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Autor {
	
	private Long id;

	private String nome; 

	@JsonFormat(pattern = "dd/MM/yyyy")
	private String dataNacimento;
		
	private String nacionalide;
	
	private List<Livro> livros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public String getNacionalide() {
		return nacionalide;
	}

	public void setNacionalide(String nacionalide) {
		this.nacionalide = nacionalide;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
