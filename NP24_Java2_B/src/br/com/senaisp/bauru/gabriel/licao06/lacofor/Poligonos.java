package br.com.senaisp.bauru.gabriel.licao06.lacofor;

public class Poligonos {

	public void montarQuadrado() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				System.out.print("" + lin + col + " ");
			}//fim for col
			System.out.println();

		}//fim for lin

	}

	public void montarTrianguloInferior() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col <= lin) {
					System.out.print("" + lin + col + " ");
				} else {
					System.out.print("   ");
				}
			}//fim for col
			System.out.println();
		}//fim for lin
	}

	public void montarTrianguloSuperior() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col >= lin) {
					System.out.print("" + lin + col + " ");
				} else {
					System.out.print("   ");
				}
			}//fim for col

			System.out.println();
		}//fim for lin
	}
	public void montarLinhaDiagonalPrincipal() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col == lin) {
					System.out.print("" + lin + col + " ");
				} else {
					System.out.print("   ");
				}
			}//fim for col

			System.out.println();
		}//fim for lin
	}
	public void montarLinhaDiagonalInverdita() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col +lin == 9) {
					System.out.print("" + lin + col + " ");
				} else {
					System.out.print("   ");
				}
			}//fim for col

			System.out.println();
		}//fim for lin
	}
	public void montarX() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col +lin == 9 || lin==col) {
					System.out.print("" + lin + col + " ");
				} else {
					System.out.print("   ");
				}
			}//fim for col

			System.out.println();
		}//fim for lin
	}
}
