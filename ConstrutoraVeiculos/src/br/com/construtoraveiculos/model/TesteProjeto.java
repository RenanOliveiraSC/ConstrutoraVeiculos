package br.com.construtoraveiculos.model;

public class TesteProjeto {

	public static void main(String[] args) {

		Projeto projeto1 = new Projeto();
		Projeto projeto2 = new Projeto();
		Projeto projeto3 = new Projeto();

		projeto1.setProCodigo(01);
		projeto1.setProNome("Jetta");
		projeto1.setProCusto(25200);
		
		projeto2.setProCodigo(01);
		projeto2.setProNome("Jetta");
		projeto2.setProCusto(25200);

		projeto3.setProCodigo(01);
		projeto3.setProNome("Jetta");
		projeto3.setProCusto(25200);
		
		
		System.out.println(
				"Código do Projeto: " + projeto1.getProCodigo() + "\nNome do proejto: " + projeto1.getProNome());

	}
}
