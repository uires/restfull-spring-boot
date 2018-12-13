package com.sousa.cursomc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sousa.cursomc.entity.Produto;
import com.sousa.cursomc.service.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService service;

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> buscar(@PathVariable(required = true) Long id) {
		Produto produto = service.buscar(id);
		return ResponseEntity.ok().body(produto);
	}

	@GetMapping
	public ResponseEntity<?> buscar() {
		Iterable<Produto> todos = service.buscarTodos();
		return ResponseEntity.ok().body(todos);
	}
}
