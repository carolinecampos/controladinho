package com.carolcampos.controladinho.enumerated;

public enum StatusLancamento {
	
	PAGO(1,"Pago"),
	PENDENTE(2,"Pendente");
	
	private final int codigo;
	private final String descricao;
		
	private StatusLancamento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
}
