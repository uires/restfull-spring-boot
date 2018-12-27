package com.sousa.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sousa.cursomc.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
