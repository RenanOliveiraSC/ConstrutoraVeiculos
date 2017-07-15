package br.com.construtoraveiculos.model;

public class TestePeca {

	public static void main(String[] args) {

		Peca peca1 = new Peca();
		Peca peca2 = new Peca();
		Peca peca3 = new Peca();

		peca1.setPecCodigo(000001);
		peca1.setPecNome("Parafuso Sextavado 8mm");
		peca1.setPecPreco(0.25);
		peca1.setPecCor("Azul");

		peca2.setPecCodigo(000002);
		peca2.setPecNome("Chave Sextavada 15mm");
		peca2.setPecPreco(3.50);
		peca2.setPecCor("Verde");

		peca3.setPecCodigo(000003);
		peca3.setPecNome("Chave Sextavada 15mm");
		peca3.setPecPreco(3.50);
		peca3.setPecCor("Verde");

	}
}
