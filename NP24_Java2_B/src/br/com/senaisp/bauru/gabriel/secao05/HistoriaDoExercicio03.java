package br.com.senaisp.bauru.gabriel.secao05;

import javax.swing.JOptionPane;

public class HistoriaDoExercicio03 {

	public static void main(String[] args) {
		/*
		 * Historia
		 * 
		 * O(a) (1) diz que os lemures são (2) mas que (3) ja pesnou muito sobre
		 * isso,porem desde (4) fala que ja sente isso. Ele(a) tem um sonho que e (5)
		 * porem que envolve uma quantia de (6)para realiza-lo,sendo um valor alto para
		 * ela no momento.Porem dentro de um ano ela ja conseguiu juntar (7) para o
		 * sonho. Para ele(a) uma inspiração e o (8),e um hobbie muito aclamado para ele
		 * e (9),que envolve somente (10) para faze-lo
		 */

		// Os numeros sao para se guiar na historia acima (nanem1 = (1)

		String name1 = JOptionPane.showInputDialog("Qual o seu nome ?");
		String lemure2 = JOptionPane.showInputDialog("O que sao os lemures para você ?");
		String lemure3 = JOptionPane.showInputDialog("Ja pensou sobre o que os lemures sao para você ?");
		String numero4 = JOptionPane.showInputDialog("Escolha um numero de 5 a 10");
		String sonho5 = JOptionPane.showInputDialog("Um sonho que você tem");
		String valor6 = JOptionPane.showInputDialog("Quantos reais te ajudaria agora ?");
		String valor7 = JOptionPane.showInputDialog("Quantos reais que você conseguiria guardar em 1 ano ?");
		String inspiração8 = JOptionPane.showInputDialog("Uma inspiração para você");
		String hobbie9 = JOptionPane.showInputDialog("Um hobbie seu");
		String centavos10 = JOptionPane.showInputDialog("Qual valor você gastaria em uma coxinha");

		JOptionPane.showMessageDialog(null,
				"Boa noite senhoras e senhores,hoje estamo aqui com o " + name1 + " essa pessoa diz que os lemures são "
						+ lemure2 + " mas que " + lemure3 + " ja pensou muito sobre isso " + " porem desde " + numero4
						+ " fala que ja sente isso.Ele diz que tem um sonho que é " + sonho5 + " porem que envolve uma quantia de  "
						 + valor6 + " para poder reliza-lo,sendo um valor alto para ela no momento.Porem dentro de um ano ela ja conseguiu juntar "
						 + valor7 + " para o sonho.Para ele uma inspiração e o " + inspiração8 + " , e um hobbie muito aclamado para ele e " + hobbie9 +
						 " , que envolve somente " + centavos10 + " para faze-lo " );

	}

}
