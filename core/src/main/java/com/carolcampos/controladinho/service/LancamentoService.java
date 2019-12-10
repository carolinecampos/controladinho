package com.carolcampos.controladinho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carolcampos.controladinho.model.Lancamento;
import com.carolcampos.controladinho.repository.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired
	LancamentoRepository repository;
	
	public List<Lancamento> findAll() {
		return repository.findAll();
	}

}
