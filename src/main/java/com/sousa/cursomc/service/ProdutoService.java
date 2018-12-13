package com.sousa.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sousa.cursomc.entity.Produto;
import com.sousa.cursomc.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;

	public Produto buscar(Long id) {
		Optional<Produto> produto = repository.findById(id);
		return produto.orElse(null);
	}

	public Iterable<Produto> buscarTodos() {
		return repository.findAll();
	}
}
