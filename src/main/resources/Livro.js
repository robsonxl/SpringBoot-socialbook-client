$(function(){
	$(".js-load-books").on('click', function(){
		$.ajax({	
			url:"http://localhost:8080/livros",
			type:"get",
			headers:{
				"Authorization" : "Basic cm9ic29uOjEyMzQ="
			},
			success: function(response){
				montaTabela(response)
			}
		});
	})
});

function montaTabela(dados){
	$(".js-books-table-body tr").remove();
	for(var i=0; i<dados.length; i++){
		montaLinha(dados[i]);
	}
}

function montaLinha(linha){
	var linhaTabela = $("<tr/>")
	$(".js-books-table-body").append(linhaTabela);
	linhaTabela.append("<td>" + linha.id + "</td>")
	linhaTabela.append("<td>" + linha.nome + "</td>")
	linhaTabela.append("<td>" + linha.editora + "</td>")
	linhaTabela.append("<td>" + linha.publicacao + "</td>")
	linhaTabela.append("<td>" + linha.resumo + "</td>")	
}