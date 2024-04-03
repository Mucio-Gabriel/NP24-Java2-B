package br.com.senaisp.bauru.gabriel.Test;

public class Teste {

	public static void main(String[] args) {
		  for (int var1 = 0; var1 < 2; var1++) {
		   for (int var2 = 0; var2 < 2; var2++) {
		    if (var2 == 2) {
		     continue;
		    }
		   System.out.println("var1:" + var1 + ", var2:" + var2);
		   }
		  }
		  for (;;) {
			     System.out.println("Bem-vindo ao Java");
			   }
		}
}