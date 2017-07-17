package br.com.construtoraveiculos.model;

public class TesteCategoriaPeca {

	public static void main(String[] args) {

		Categoria_Peca categoria_Peca1 = new Categoria_Peca();
		Categoria_Peca categoria_Peca2 = new Categoria_Peca();
		Categoria_Peca categoria_Peca3 = new Categoria_Peca();

		categoria_Peca1.setCpeDescricao("Parafusos");
		categoria_Peca2.setCpeDescricao("Ferramentas");
		categoria_Peca3.setCpeDescricao("Auto-peças");

		System.out.println("Categorias Cadastradas: " + "\n" + categoria_Peca1.getCpeDescricao() + "\n"
				+ categoria_Peca2.getCpeDescricao() + "\n" + categoria_Peca3.getCpeDescricao());

	}
}
