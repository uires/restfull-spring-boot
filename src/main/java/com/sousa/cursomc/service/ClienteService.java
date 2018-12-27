package com.sousa.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sousa.cursomc.entity.Cliente;
import com.sousa.cursomc.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;

	public Cliente buscarCliente(Long id) {
		Optional<Cliente> cliente = repository.findById(id);
		return cliente.orElse(null);
	}
}
