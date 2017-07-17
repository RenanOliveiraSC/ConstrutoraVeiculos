package br.com.construtoraveiculos.model;

public class Categoria_Fornecedor extends Fornecedor {

	private int cafCodigo;
	private String cafDescricao;

	public int getCafCodigo() {
		return cafCodigo;
	}

	public void setCafCodigo(int cafCodigo) {
		this.cafCodigo = cafCodigo;
	}

	public String getCafDescricao() {
		return cafDescricao;
	}

	public void setCafDescricao(String cafDescricao) {
		this.cafDescricao = cafDescricao;
	}

}
