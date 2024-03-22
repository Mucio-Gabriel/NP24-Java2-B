package br.com.senaisp.bauru.gabriel.licao04.exercicio;

import java.util.Random;

public class MetodosCalculo {
	
	/**
	 * Metodo paara calcular a temperatua Celsius a partir de uma temperatura em Fahrenheit
	 * @param temp Informar a temperatua em °F
	 * @return Retorna a temperatura em °C
	 */ 

	public double converterF2c(double temp) {
		return (temp -32) * 5/9;
	}
	
	/**
	 * Metodo que calcula a hipotenusa
	 * @param co Informar o cateto Oposto
	 * @param ca Informa o cateto Adjacente
	 * @return Retorna o valor da Hipotenusa
	 */

	public double calcularHipotenusa(double co, double ca) {
		return Math.sqrt(Math.pow(ca, 2)+Math.pow(co, 2));
	}

	public int jogarDados() {
		Random rnd = new Random();
		return rnd.nextInt(6) + 1 + rnd.nextInt(6)+1;
	}
	
}
