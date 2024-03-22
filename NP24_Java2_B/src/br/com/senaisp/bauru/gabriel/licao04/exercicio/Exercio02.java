package br.com.senaisp.bauru.gabriel.licao04.exercicio;

import javax.swing.JOptionPane;

public class Exercio02 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome completo:");
		ProcessarNome pn = new ProcessarNome();
		System.out.println(pn.processarNome(nome));

	}

}
