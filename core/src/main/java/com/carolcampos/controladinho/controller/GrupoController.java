package com.carolcampos.controladinho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carolcampos.controladinho.model.Grupo;
import com.carolcampos.controladinho.service.GrupoService;

@CrossOrigin
@RestController
@RequestMapping("/grupo")
public class GrupoController {
	
	@Autowired
	private GrupoService service;
	
	@GetMapping	
	public List<Grupo> findAll() {
		return service.findAll();
	}	

}
