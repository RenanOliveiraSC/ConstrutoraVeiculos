package br.com.construtoraveiculos.model;

public class TesteCidade {

	public static void main(String[] args) {

		Cidade cidade1 = new Cidade();
		cidade1.setCidCodigo(001);
		cidade1.setCidNome("Porto Alegre");
		Uf uf1 = new Uf();
		uf1.setUfNome("RS");
		cidade1.setUf(uf1);

		Cidade cidade2 = new Cidade();
		cidade2.setCidCodigo(002);
		cidade2.setCidNome("Curitiba");
		Uf uf2 = new Uf();
		uf2.setUfNome("PR");
		cidade2.setUf(uf2);

		Cidade cidade3 = new Cidade();
		cidade3.setCidCodigo(003);
		cidade3.setCidNome("Florianópolis");
		Uf uf3 = new Uf();
		uf3.setUfNome("SC");
		cidade3.setUf(uf3);

		Cidade cidade4 = new Cidade();
		cidade4.setCidCodigo(004);
		cidade4.setCidNome("São Paulo");
		Uf uf4 = new Uf();
		uf4.setUfNome("SP");
		cidade4.setUf(uf4);

		Cidade cidade5 = new Cidade();
		cidade5.setCidCodigo(005);
		cidade5.setCidNome("Rio de Janeiro");
		Uf uf5 = new Uf();
		uf5.setUfNome("RJ");
		cidade5.setUf(uf5);

		Cidade cidade6 = new Cidade();
		cidade6.setCidCodigo(006);
		cidade6.setCidNome("Vitória");
		Uf uf6 = new Uf();
		uf6.setUfNome("ES");
		cidade6.setUf(uf6);

		System.out.println("Código: " + cidade1.getCidCodigo() + "  " + "Cidade: " + cidade1.getCidNome() + "-"
				+ cidade1.getUf().getUfNome());
		System.out.println();
		System.out.println("Código: " + cidade2.getCidCodigo() + "  " + "Cidade: " + cidade2.getCidNome() + "-"
				+ cidade2.getUf().getUfNome());
		System.out.println();
		System.out.println("Código: " + cidade3.getCidCodigo() + "  " + "Cidade: " + cidade3.getCidNome() + "-"
				+ cidade3.getUf().getUfNome());
		System.out.println();
		System.out.println("Código: " + cidade4.getCidCodigo() + "  " + "Cidade: " + cidade4.getCidNome() + "-"
				+ cidade4.getUf().getUfNome());
		System.out.println();
		System.out.println("Código: " + cidade5.getCidCodigo() + "  " + "Cidade: " + cidade5.getCidNome() + "-"
				+ cidade5.getUf().getUfNome());
	}
}
