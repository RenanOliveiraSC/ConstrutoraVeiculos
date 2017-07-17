package br.com.construtoraveiculos.model;

public class TesteCategoriaFornecedor {

	public static void main(String[] args) {

		Categoria_Fornecedor categoria1 = new Categoria_Fornecedor();
		Categoria_Fornecedor categoria2 = new Categoria_Fornecedor();
		Categoria_Fornecedor categoria3 = new Categoria_Fornecedor();

		categoria1.setCafCodigo(1);
		categoria1.setCafDescricao("Ferramentas");
		categoria1.setForCodigo(12345);
		categoria1.setForNome("Planeta Ferramentas");

		categoria2.setCafCodigo(2);
		categoria2.setCafDescricao("Parafusos");

		categoria3.setCafCodigo(3);
		categoria3.setCafDescricao("Peças e Acessórios");

		System.out.println("Nome do Fornecedor: " + categoria1.getForNome() + "\nCódigo da Categoria: "
				+ categoria1.getCafCodigo() + "\nNome da Categoria: " + categoria1.getCafDescricao());

		System.out.println();

		System.out.println("Código da Categoria: " + categoria2.getCafCodigo() + "\nNome da Categoria: "
				+ categoria2.getCafDescricao());

		System.out.println();

		System.out.println("Código da Categoria: " + categoria3.getCafCodigo() + "\nNome da Categoria: "
				+ categoria3.getCafDescricao());
	}
}
