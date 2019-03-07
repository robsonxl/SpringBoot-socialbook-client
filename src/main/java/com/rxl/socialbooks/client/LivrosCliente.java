package com.rxl.socialbooks.client;

import java.net.URI;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.rxl.socialbooks.domain.Livro;

public class LivrosCliente {

	private static final String DATA_AUTHORIZATION = "Basic cm9ic29uOjEyMzQ=";
	private static final String ENDPOINT = "http://localhost:8080/livros";
	public List<Livro> listar(){
		RestTemplate restTemplate = new RestTemplate();
		RequestEntity<Void> request = RequestEntity.get(URI.create(ENDPOINT))
				.header(HttpHeaders.AUTHORIZATION,DATA_AUTHORIZATION).build();
		ResponseEntity<List<Livro>> livros = restTemplate.exchange(request,new ParameterizedTypeReference<List<Livro>>(){});
		return livros.getBody();
	}
	
	public String salvar(Livro livro){
		
		RequestEntity<Livro> request = RequestEntity.post(URI.create(ENDPOINT))
				.header(HttpHeaders.AUTHORIZATION,DATA_AUTHORIZATION)
					.body(livro);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Void> response = restTemplate.exchange(request, Void.class);
		String location =  response.getHeaders().getLocation().toString();
		return location;
	}
	
}
