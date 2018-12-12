package com.sousa.cursomc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sousa.cursomc.entity.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
}
