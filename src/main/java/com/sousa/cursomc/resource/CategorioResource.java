package com.sousa.cursomc.resource;

import javax.xml.ws.http.HTTPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sousa.cursomc.entity.Categoria;
import com.sousa.cursomc.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategorioResource {

	@Autowired
	private CategoriaService service;

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> listar(@PathVariable Long id) {
		try {
			Categoria categoria = service.buscar(id);
			return ResponseEntity.ok().body(categoria);
		} catch (HTTPException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
