package br.com.construtoraveiculos.model;

import java.text.DecimalFormat;

public class Projeto {
	DecimalFormat df = new DecimalFormat("#0.00");
	private int proCodigo;
	private String proNome;
	private double proCusto;
	private int proCategoria;

	public int getProCodigo() {
		return proCodigo;
	}

	public void setProCodigo(int proCodigo) {
		this.proCodigo = proCodigo;
	}

	public String getProNome() {
		return proNome;
	}

	public void setProNome(String proNome) {
		this.proNome = proNome;
	}

	public double getProCusto() {
		return proCusto;
	}

	public void setProCusto(double proCusto) {
		this.proCusto = proCusto;
	}

	public int getProCategoria() {
		return proCategoria;
	}

	public void setProCategoria(int proCategoria) {
		this.proCategoria = proCategoria;
	}

}
