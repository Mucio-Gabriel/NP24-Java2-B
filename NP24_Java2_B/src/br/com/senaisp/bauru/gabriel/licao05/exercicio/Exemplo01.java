package br.com.senaisp.bauru.gabriel.licao05.exercicio;

public class Exemplo01 {

	public static void main(String[] args) {
	
		int idade =65;
		boolean bPodeDirigir = !(idade <= 18 || idade >=65);    // <--------|
		                            //idade >=18 && idade <= 65 mesma coisa |
		System.out.println("Você " + (bPodeDirigir ? "Pode":"Não Pode" )+ "Dirigir");

	}

}
