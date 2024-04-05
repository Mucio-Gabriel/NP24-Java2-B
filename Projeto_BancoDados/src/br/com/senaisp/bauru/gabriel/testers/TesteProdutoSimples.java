package br.com.senaisp.bauru.gabriel.testers;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.senaisp.bauru.gabriel.classes.ProdutoSimples;

public class TesteProdutoSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("Menu");
			System.out.println("1 - Criar Produto");
			System.out.println("2 - Consultar Produto");
			System.out.println("3 - Alterar Produto");
			System.out.println("4 - Excluir Produto");
			System.out.println("9 - Fim");
			op = sc.nextInt();
			switch (op) {
			case 1 -> criarProduto(sc);
			case 2 -> consultarProduto(sc);
			case 3 -> alterarProduto(sc);
			case 4 -> excluirProduto(sc);
			case 9 -> System.out.println("Bye!");
			default -> System.out.println("Opção invalida!");
			}
		} while (op != 9);
	}

	private static void excluirProduto(Scanner sc) {
		System.out.println("Exclusao de Produtos");
		ProdutoSimples prd = pesquisarProduto(sc);
		// Confirmação de Exclusão
		System.out.println("Deseja cancelar a exclusão? (S/N)");
		String res = sc.nextLine();

		// Estou perguntando se quer CANCELAR a EXCLUSÃO!!!
		if (res.equalsIgnoreCase("N")) {
			try {
				prd.apagar();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		// Volta do menu
		System.out.println("Digite algo para voltar ao menu");
		sc.nextLine(); // Captura do ultimo enter numetico

	}

	private static void alterarProduto(Scanner sc) {
		System.out.println("Alteração de produto");
		ProdutoSimples prd = pesquisarProduto(sc);

		if (prd != null) {

			System.out.println("Digite a descrição do produto:");
			prd.setDescricao(sc.nextLine());

			System.out.println("Digite o saldo do produto:");
			prd.setSaldo(sc.nextInt());

			System.out.println("Digite o custo do produto:");
			prd.setCusto(sc.nextDouble());

			// Como o ultimo campo foi numero, capturamos o enter
			sc.nextLine();
			System.out.println("Confirmar a alteração? (N/S)");
			String conf = sc.nextLine();
			if (conf.equalsIgnoreCase("S")) {
				try {
					prd.gravar();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			
			} // Fm do if de confirmação
		
		} // Fim do if de pesquisa produto

		// Volta do menu
		System.out.println("Digite algo para voltar ao menu");
		sc.nextLine(); // Captura do ultimo enter numetico

	}

	private static void consultarProduto(Scanner sc) {
		sc.nextLine();

		System.out.println("Consulta de produtos");
		
		pesquisarProduto(sc);

		// Pausa para voltar para o menu

		System.out.println("Digite algo para voltar ao menu");
		sc.nextLine(); // Captura do ultimo enter numetico
		sc.nextLine(); // Pauda para voltar

	}

	private static ProdutoSimples pesquisarProduto(Scanner sc) {
		System.out.println("Digite o codigo do produto a pesquisar:");
		int cod = sc.nextInt();
		sc.nextLine(); // captura do enter

		try {

			// Pesquisando o produto
			ProdutoSimples prd = ProdutoSimples.FindByPK(cod);

			// Mostranfdo o produto
			System.out.println(prd);

			return prd;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	private static void criarProduto(Scanner sc) {
		sc.nextLine();// Captura do enter do menu

		System.out.println("Cadastramento de produto:");

		System.out.println("Digite a descriçaõ do produto:");
		String desc = sc.nextLine();

		System.out.println("Digite o saldo do produto:");
		int sal = sc.nextInt();

		System.out.println("Digite o custo do produto:");
		double cus = sc.nextDouble();

		try {

			// Criando o produto
			ProdutoSimples prd = ProdutoSimples.create(desc, sal, cus);

			// Mostrando o produto
			System.out.println(prd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		// Pausa para voltar ao menu
		System.out.println("Digite enter para voltar ao menu");
		sc.nextLine();
	}
}