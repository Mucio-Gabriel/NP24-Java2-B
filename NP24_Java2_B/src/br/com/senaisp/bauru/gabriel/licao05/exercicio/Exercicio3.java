package br.com.senaisp.bauru.gabriel.licao05.exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o codigo da cor (1,2 ou 3):");
		int codigo = sc.nextInt();
		String cor = "Cor invalida";
		
		switch(codigo) {
		case 1 -> cor = "Proxima luz do semaforo sera verde";
		case 2 -> cor = "Proxima luz do semaforo sera amarela";
		case 3 -> cor = "Proxima luz do semaforo sera vermelha";
		}
		
		//	Outra forma de usar o switch
		/*
		switch(codigo) {
		case 1 : cor = "Proxima luz do semaforo sera verde";break;
		case 2 : cor = "Proxima luz do semaforo sera amarela";break;
		case 3 : cor = "Proxima luz do semaforo sera vermelha";break;
		}
		*/
		
		//isso tudo aqui em baixo e igual ao que ta em cima
		/*if(codigo ==1) {
			cor = "Proxima luz do semaforo sera verde";
		}else if (codigo == 2) {
			cor = "Proxima luz do semaforo sera amarelo";
		}else if (codigo == 3) {
			cor = "Proxima luz do semaforo sera vermelho";
		}
		*/
			System.out.println(cor);
			sc.close();
	}

}
