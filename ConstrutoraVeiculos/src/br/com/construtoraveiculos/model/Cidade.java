package br.com.construtoraveiculos.model;

public class Cidade extends Uf {

	private int cidCodigo;
	private String cidNome;
	private Uf uf;

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

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	
}
