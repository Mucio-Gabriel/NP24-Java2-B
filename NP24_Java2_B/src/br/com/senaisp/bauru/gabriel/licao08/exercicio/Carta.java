package br.com.senaisp.bauru.gabriel.licao08.exercicio;

public class Carta {
	private String[] naipes = {"♦","♠","♥","♣"};
	private String[] numeros = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	private int naipe;
	private int valor;
	private String numero;
	//Constructor
	public Carta (int nap,int num) {
		//Trantando o Naipe para que seja de 0 a 3
		if(nap <0 || nap >3) {
			throw new RuntimeException("Os naioes devem ser de 0 a 3");
		}
		//Tratando o numero para que seja de 0 a 12
		if (num<0 || num >12) {
			throw new RuntimeException("Os numeros devem ser de 0 a 12");
		}
		//Atribuindo os Fields
		naipe = nap;
		valor = num;
		numero = numeros[num];
	}
	public String getNaipe() {
		return naipes[naipe];
	}
	public String getNumero() {  
		return numero;
	}
	public int getValor() {
		return valor > 9 ? 10 : valor +1;
	}
	
	public String toString() {
		String apoio = "╔═════╗\n"
				     + "║##   ║\n"
				     + "║  §  ║\n"
				     + "║   ##║\n"
				     + "╚═════╝\n";
		String br = valor == 9 ? "" : " ";
		apoio = apoio.replaceFirst("##", getNumero()+ br); // lembrando que 9 e indice
		apoio = apoio.replace("§", getNaipe());
		apoio = apoio.replaceFirst("##", br + getNumero());
		return apoio;
		
	}
	
}
