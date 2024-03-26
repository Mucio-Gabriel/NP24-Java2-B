package br.com.senaisp.bauru.gabriel.licao05.exercicio;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 10:");
		int vlr = sc.nextInt();
		switch(vlr) {
		case 1:System.out.println("você ganhou um boné!");
		case 2: System.err.println("Você ganhou uma caneta!");
		case 3: System.err.println("Você ganhou um lapis!");
		case 4: System.err.println("Você ganhou uma calculadora!");
		case 5: System.err.println("Você ganhou uma borracha!");
		case 6: System.err.println("Você ganhou uma regua!");
		case 7: System.err.println("Você ganhou uma tranferidor!");
		case 8: System.err.println("Você ganhou uma compasso!");
		case 9: System.err.println("Você ganhou uma celular!");
		case 10: System.err.println("Você ganhou uma R$1.000,00!");
		default : System.out.println("Que pena,voce perdeu tudo!");
		}
		sc.close();

	}

}
