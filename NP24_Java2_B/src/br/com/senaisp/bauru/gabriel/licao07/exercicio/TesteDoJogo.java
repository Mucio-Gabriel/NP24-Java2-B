package br.com.senaisp.bauru.gabriel.licao07.exercicio;

public class TesteDoJogo {

	public static void main(String[] args) {
		
		Cartao ct01 = new Cartao();
		System.out.println(ct01);
		Cartao ct02 = new Cartao();
		System.out.println(ct02);
		//criando uma máquina
		MaquinaDeFliperama M1 = new MaquinaDeFliperama("Mk1");
			M1.lerCartao(ct01);
				
	

	}

}
