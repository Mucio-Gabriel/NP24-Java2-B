package br.com.senaisp.bauru.gabriel.licao06.lacofor;

public class Exemplo1 {

	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			System.out.println(("7x" + i )+" = " + ( 7 * i ));
		}
		//contagem regressiva
		for(int i=100;i>0;i--) {
			System.out.println(i);
		}
		//for sem as chaves (nao recomendavel)
		for (int i = 0;i<5;i++)
			System.out.println(i);
		System.out.println("Linha seguinte!");
//for sem parametros
		for(;;) {
			System.out.println("For infinito!!");
		}
	}

}
