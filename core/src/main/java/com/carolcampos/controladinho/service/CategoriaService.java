package com.carolcampos.controladinho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carolcampos.controladinho.model.Categoria;
import com.carolcampos.controladinho.repository.CategoriaRepository;


@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository repository;
	
	public List<Categoria> findAll() {
		return (List<Categoria>) repository.findAll();
	}
	
	public void save(Categoria categoria) {
		repository.save(categoria);
	}
	
	public void delete(Categoria categoria) {
		repository.delete(categoria);
	}
	
	public void findById(Categoria categoria) {
		repository.findById(categoria.getId());
	}
 

}
