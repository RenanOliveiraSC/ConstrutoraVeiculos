package br.com.construtoraveiculos.model;

public class TesteProjeto {

	public static void main(String[] args) {

		Projeto projeto1 = new Projeto();
		Projeto projeto2 = new Projeto();
		Projeto projeto3 = new Projeto();

		projeto1.setProCodigo(01);
		projeto1.setProNome("Jetta");
		// projeto1.setProCusto('1');

		System.out.println(
				"Código do Projeto: " + projeto1.getProCodigo() + "\nNome do proejto: " + projeto1.getProNome());

	}
}
