package br.com.construtoraveiculos.model;

public class Cidade extends Uf {

	private int cidCodigo;
	private String cidNome;
	private int cidUf;

	public int getCidCodigo() {
		return cidCodigo;
	}

	public void setCidCodigo(int cidCodigo) {
		this.cidCodigo = cidCodigo;
	}

	public String getCidNome() {
		return cidNome;
	}

	public void setCidNome(String cidNome) {
		this.cidNome = cidNome;
	}

	public int getCidUf() {
		return cidUf;
	}

	public void setCidUf(int cidUf) {
		this.cidUf = cidUf;
	}

}
