package br.com.senaisp.bauru.gabriel.secao05;

import javax.swing.JOptionPane;

public class HistoriaDoExercicio03_2 {

	public static void main(String[] args) {
        //Para sim ou não
		boolean resp = JOptionPane.showConfirmDialog(null, "Você quer mesmo participar","Participação",
				                                       JOptionPane.YES_OPTION,
				                                       JOptionPane.QUESTION_MESSAGE) 
				
					
				==JOptionPane.YES_OPTION;
		if(resp) {
			
		//Nome da pessoa (Pergunta 1)
		String nome = (String)JOptionPane.showInputDialog(null,
				                              "Qual o seu nome?",
				                              "Perguta 1",
				                              JOptionPane.QUESTION_MESSAGE,
				                              null,
				                              null,
				                              
				                              "Digite seu nome");
		//Pergunta 2
		String idade = (String)JOptionPane.showInputDialog("Qual a sua Idade?");
		
		//int idade = 
		
		
		
		}else {
			JOptionPane.showMessageDialog(null, "Tudo bem,ate mais");
		}
		
	}

}
