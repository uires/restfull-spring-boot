package com.sousa.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sousa.cursomc.entity.Categoria;
import com.sousa.cursomc.repository.CategoriaRepository;
import com.sousa.cursomc.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria buscar(Long id) {
		Optional<Categoria> optional = repository.findById(id);
		return optional.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto com o id: " + id + " não foi encontrado no banco de dados, tipo:" + Categoria.class.getName()));
	}
}
