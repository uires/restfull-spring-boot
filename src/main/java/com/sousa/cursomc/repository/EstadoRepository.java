package com.sousa.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sousa.cursomc.entity.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {}
