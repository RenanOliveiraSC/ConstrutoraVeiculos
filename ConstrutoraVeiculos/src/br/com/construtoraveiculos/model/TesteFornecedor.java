package br.com.construtoraveiculos.model;

public class TesteFornecedor {

	public static void main(String[] args) {

		Fornecedor fornecedor1 = new Fornecedor();
		Fornecedor fornecedor2 = new Fornecedor();

		fornecedor1.setForCodigo(12345);
		fornecedor1.setForNome("Planeta Ferramentas");
		fornecedor1.setForCategoria(1);

		fornecedor2.setForCodigo(54321);
		fornecedor2.setForNome("Blu Parafusos");
		fornecedor2.setForCategoria(2);

		System.out.println("Código do Fornecedor: " + fornecedor1.getForCodigo() + "\nNome do Fornecedor: "
				+ fornecedor1.getForNome() + "\nCategoria: " + fornecedor1.getForCategoria());

		System.out.println();

		System.out.println("Código do Fornecedor: " + fornecedor2.getForCodigo() + "\nNome do Fornecedor: "
				+ fornecedor2.getForNome() + "\nCategoria: " + fornecedor2.getForCategoria());
	}
}
