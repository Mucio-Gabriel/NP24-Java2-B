package br.com.senaisp.bauru.gabriel.licao04.secao04;

import java.util.Random;

public class ExemploRandom {

	public static void main(String[] args) {
		//Especificando a Seed
		Random rnd = new Random(20L);
		System.out.println(rnd.nextInt(60)+1);
		System.out.println(rnd.nextInt(60)+1);
		System.out.println(rnd.nextInt(60)+1);
		System.out.println(rnd.nextInt(60)+1);
		System.out.println(rnd.nextInt(60)+1);
		System.out.println(rnd.nextInt(60)+1);
		
		//Nao especificando a Seed
		Random rnd2 = new Random();
		System.out.println("================");
		System.out.println(rnd2.nextInt(60)+1);
		System.out.println(rnd2.nextInt(60)+1);
		System.out.println(rnd2.nextInt(60)+1);
		System.out.println(rnd2.nextInt(60)+1);
		System.out.println(rnd2.nextInt(60)+1);
		System.out.println(rnd2.nextInt(60)+1);

	}

}
