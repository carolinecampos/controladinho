package com.carolcampos.controladinho.enumerated;

public enum Perfil {
	
	SUPORTE(1,"Suporte"), 
	ADMINISTRADOR(2,"Administrador"), 
	CONVIDADO(3, "Convidado");
	
	private final int codigo;
	private final String nome;
	
	private Perfil(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}


}
