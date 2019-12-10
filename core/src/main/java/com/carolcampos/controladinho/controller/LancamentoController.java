package com.carolcampos.controladinho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carolcampos.controladinho.model.Lancamento;
import com.carolcampos.controladinho.service.LancamentoService;

@CrossOrigin
@RestController
@RequestMapping("/lancamento")
public class LancamentoController {
	
	@Autowired
	private LancamentoService service;
	
	@GetMapping	
	public List<Lancamento> findAll() {
		return service.findAll();
	}	

}
