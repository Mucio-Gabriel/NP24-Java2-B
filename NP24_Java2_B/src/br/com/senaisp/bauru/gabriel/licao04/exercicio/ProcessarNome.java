package br.com.senaisp.bauru.gabriel.licao04.exercicio;

public class ProcessarNome {
	
	public String processarNome(String nome) {
		//Pegando o Sobrenome
        String sbnom = nome.substring(nome.lastIndexOf(' ')+1);
        String iniNom = "" + nome.charAt(0)+ ".";
        return sbnom + ", "+ iniNom;
	}
}
