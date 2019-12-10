package com.carolcampos.controladinho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carolcampos.controladinho.model.Grupo;
import com.carolcampos.controladinho.repository.GrupoRepository;

@Service
public class GrupoService {
	
	@Autowired
	GrupoRepository repository;
	
	public List<Grupo> findAll() {
		return repository.findAll();
	}

}
