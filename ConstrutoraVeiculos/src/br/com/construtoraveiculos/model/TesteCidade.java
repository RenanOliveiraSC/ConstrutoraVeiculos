package br.com.construtoraveiculos.model;

public class TesteCidade {

	public static void main(String[] args) {

		Cidade cidade1 = new Cidade();
		Cidade cidade2 = new Cidade();
		Cidade cidade3 = new Cidade();
		Cidade cidade4 = new Cidade();
		Cidade cidade5 = new Cidade();
		Cidade cidade6 = new Cidade();

		cidade1.setCidCodigo(001);
		cidade1.setCidNome("Porto Alegre");
		cidade1.setCidUf(1);
		cidade1.setUfNome("RS");

		cidade2.setCidCodigo(002);
		cidade2.setCidNome("Curitiba");
		cidade2.setCidUf(2);

		cidade3.setCidCodigo(003);
		cidade3.setCidNome("Florianópolis");
		cidade3.setCidUf(3);

		cidade4.setCidCodigo(004);
		cidade4.setCidNome("São Paulo");
		cidade4.setCidUf(4);

		cidade5.setCidCodigo(005);
		cidade5.setCidNome("Rio de Janeiro");
		cidade5.setCidUf(5);

		cidade6.setCidCodigo(006);
		cidade6.setCidNome("Vitória");
		cidade6.setCidUf(6);

		System.out.println("Código: " + cidade1.getCidCodigo() + "  " + "Cidade: " + cidade1.getCidNome() + "-"
				+ cidade1.getUfNome());

	}
}
