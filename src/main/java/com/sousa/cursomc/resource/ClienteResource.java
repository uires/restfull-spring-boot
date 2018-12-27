package com.sousa.cursomc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sousa.cursomc.entity.Cliente;
import com.sousa.cursomc.service.ClienteService;

@RestController
public class ClienteResource {

	@Autowired
	private ClienteService service;

	@GetMapping(path = "/clientes/{id}")
	public Cliente buscaCliente(@PathVariable Long id) {
		return service.buscarCliente(id);
	}
}
