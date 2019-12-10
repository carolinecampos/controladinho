package com.carolcampos.controladinho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carolcampos.controladinho.model.Categoria;
import com.carolcampos.controladinho.service.CategoriaService;


@CrossOrigin
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping	
	public List<Categoria> findAll() {
		return service.findAll();
	}	

}
