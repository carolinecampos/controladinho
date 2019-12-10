package com.carolcampos.controladinho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carolcampos.controladinho.model.Usuario;
import com.carolcampos.controladinho.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository repository;
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}

}
