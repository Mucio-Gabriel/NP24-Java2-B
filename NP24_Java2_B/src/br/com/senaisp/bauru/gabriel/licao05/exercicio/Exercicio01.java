package br.com.senaisp.bauru.gabriel.licao05.exercicio;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//.userLocate(Local.US) Força o separador deciaml a ser ponto, nao virgula
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da cor em nm: ");
		double nmCor = sc.nextDouble();
		String cor = "Não é uma cor visivel no espectro";
		
		if (nmCor >=380 && nmCor <450) {
			cor = "A cor e Violeta";
		}else if (nmCor >=450 && nmCor < 495) {
			cor = "A cor e Azul";
		}else if (nmCor >=495 && nmCor < 570) {
			cor = "A coré Verde";
		}else if (nmCor >= 570 && nmCor < 590) {
			cor = "A cor e Amarelo";
		}else if (nmCor >= 590 && nmCor < 620) {
			cor = "A cor e Laranja";
		}else if (nmCor >=620 && nmCor <750) {
			cor = "A cor e Vermelho";
		}
		System.out.println(cor);
		sc.close();
	}

}
