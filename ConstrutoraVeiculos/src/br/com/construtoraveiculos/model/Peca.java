package br.com.construtoraveiculos.model;

public class Peca {

	private int pecCodigo;
	private String pecNome;
	private double pecPreco;
	private String pecCor;
	private int pecCategoria;

	public int getPecCodigo() {
		return pecCodigo;
	}

	public void setPecCodigo(int pecCodigo) {
		this.pecCodigo = pecCodigo;
	}

	public String getPecNome() {
		return pecNome;
	}

	public void setPecNome(String pecNome) {
		this.pecNome = pecNome;
	}

	public double getPecPreco() {
		return pecPreco;
	}

	public void setPecPreco(double pecPreco) {
		this.pecPreco = pecPreco;
	}

	public String getPecCor() {
		return pecCor;
	}

	public void setPecCor(String pecCor) {
		this.pecCor = pecCor;
	}

	public int getPecCategoria() {
		return pecCategoria;
	}

	public void setPecCategoria(int pecCategoria) {
		this.pecCategoria = pecCategoria;
	}

}