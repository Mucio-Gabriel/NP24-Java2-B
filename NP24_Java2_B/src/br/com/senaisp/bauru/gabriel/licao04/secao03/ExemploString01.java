package br.com.senaisp.bauru.gabriel.licao04.secao03;

public class ExemploString01 {

	public static void main(String[] args) {
		String nome = "Richard";
		String nome2 = "Richard";
		//Comparamos endereço de memoria no caso de objetos (String e um objeto)
		if(nome==nome2) {
	System.out.println("Sao iguais");
		}else {
			System.out.println("Sao diferentes");
		}
		//Para vompstst objetos, usamos equals para igualdade
		if (nome.equals(nome2)) {
			System.out.println("Conteudos iguais");
		}else {
			System.out.println("Conteudo diferentes");
		}
	}

}
