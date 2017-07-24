package br.com.construtoraveiculos.model;

public class TesteCategoriaProjeto {

	public static void main(String[] args) {
		
		
		Projeto projeto1 = new Projeto();
		Projeto projeto2 = new Projeto();
		Projeto projeto3 = new Projeto();
		
		projeto1.setProCodigo(01);
		projeto1.setProNome("Projeto VolksWagem");
		projeto1.setProCusto(18000);
		
		projeto2.setProCodigo(01);
		projeto2.setProNome("Projeto Saveiro");
		projeto2.setProCusto(24000);
		
		projeto3.setProCodigo(01);
		projeto3.setProNome("Projeto Jetta");
		projeto3.setProCusto(38000);
		
		
		System.out.println("Código da Categoria: "+projeto1.getProCategoria()+"\nNome do Projeto: "+projeto1.getProNome()+"\nCusto do Proejto: R$ "+projeto1.getProCusto());
		System.out.println();
		System.out.println("Código da Categoria: "+projeto2.getProCategoria()+"\nNome do Projeto: "+projeto2.getProNome()+"\nCusto do Proejto: R$ "+projeto2.getProCusto());
		System.out.println();
		System.out.println("Código da Categoria: "+projeto3.getProCategoria()+"\nNome do Projeto: "+projeto3.getProNome()+"\nCusto do Proejto: R$ "+projeto3.getProCusto());
		
		
			
		
	}
}
