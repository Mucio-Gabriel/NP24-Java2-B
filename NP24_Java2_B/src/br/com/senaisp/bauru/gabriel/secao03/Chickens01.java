package br.com.senaisp.bauru.gabriel.secao03;

public class Chickens01 {
	public static void main(String[] args) {
		// Put yout code here

		// eggsPerChicken
		// chickenCouny

		int eggsPerChicken = 4; int chickenCouny = 8;
		int totalEggs = 0;

		// Na segunda, ao meio dia,Mr.Brown recolhe os ovos

		totalEggs = totalEggs + chickenCouny * eggsPerChicken;

		// Na Terça,Mr.Brown recolhe os ovos

		totalEggs += ++chickenCouny * eggsPerChicken;

		// Na quarta ele perde metade das galinhas e depois recolhe os ovos

		totalEggs += chickenCouny / 2 * eggsPerChicken;

		System.out.println(totalEggs);
	}
}