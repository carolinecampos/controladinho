package com.carolcampos.controladinho.enumerated;

public enum TipoLancamento {
	
	DESPESA(1,"Despesa"),
	RECEITA(2,"Receita");
	
	private final int codigo;
	private final String nome;
		
	private TipoLancamento(int codigo, String nome) {
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
