package br.com.senaisp.bauru.gabriel.secao03;

public class Chickens02 {
	public static void main(String[] args) {
		// Put yout code here

		double dailyAverage = 0;
		double monthlyAverage = 0;
		double totalEggs = 0;
		double monthlyProfit = 0.0;

		
		
		/*
		 * −Na segunda-feira, o Fazendeiro Fred recolhe 100 ovos 
		 * −Na terça-feira,recolhe 121 ovos 
		 * −Na quarta-feira, ele recolhe 117 ovos 
		 * −Qual é dailyAverage (média diária) de ovos recolhidos? 
		 * −Quantos ovos poderiam ser esperados em uma monthlyAverage (média mensal) 
		 * de 30 dias?
		 * −Se um ovo pode ser vendido com um lucro de US$ 0,18, qual é o monthlyProfit 
		 * (lucro mensal) total dos ovos?
		 */

		//Segunda fred recolhe 100 ovos
		totalEggs += 100;
		
		//Na terca ele recolhe 121
		totalEggs += 121;
		
		//Na quarta ele recolhe 117
		totalEggs += 117;
		
		//Fazendo as contas
		dailyAverage = totalEggs/3;
		monthlyAverage = dailyAverage * 30;
		monthlyProfit = monthlyAverage * 0.18;
		
		
		System.out.println("Daily Average:   " + dailyAverage);
		System.out.println("Monthly Average: " + monthlyAverage);
		System.out.println("Monthly Profit:  $" + monthlyProfit);
	}

}