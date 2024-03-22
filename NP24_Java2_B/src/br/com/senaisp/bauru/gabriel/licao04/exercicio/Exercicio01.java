package br.com.senaisp.bauru.gabriel.licao04.exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		MetodosCalculo mc = new MetodosCalculo();
		double tempC = mc.converterF2c(60.5);
		
		System.out.println("Temperatua em °C é "  + tempC);
		
		//Calculando a Hipotenusa
		double hip = mc.calcularHipotenusa(577, 3463);
		System.out.println("Hipotenusa é " + hip);
		//Sorteando os Valores
		System.out.println("Valor dos dados foi " + mc.jogarDados());
		
	}

}
