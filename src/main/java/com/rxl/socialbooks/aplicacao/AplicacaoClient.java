package com.rxl.socialbooks.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.rxl.socialbooks.client.LivrosCliente;
import com.rxl.socialbooks.domain.Livro;

public class AplicacaoClient {
	
	public static void main (String args[]) throws ParseException {		
		LivrosCliente livrosClient = new LivrosCliente();
		List<Livro> livros = livrosClient.listar();
		for (Livro livro : livros) {
			System.out.println(livro.getEditora());
			System.out.println(livro.getResumo()); 
		}
		Livro livro = new Livro();
		livro.setNome("Git Passo a Passo");
		livro.setResumo("Livro muito legal");
		livro.setEditora("ROBSON XL");
		SimpleDateFormat dataPublicacao = new SimpleDateFormat("dd/MM/yyyy");
		livro.setPublicacao(dataPublicacao.parse("26/03/2018"));
		String novoLivro = livrosClient.salvar(livro);
		System.out.println(novoLivro);
		
	}
}
