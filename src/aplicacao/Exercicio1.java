package aplicacao;

import java.util.Scanner;

import arvores.ABBINT;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBINT abb = new ABBINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Apresentar ABB");
			System.out.println("3 - Apresenta quantidade de nos na ABB");
			System.out.println("4 - Pesquisar a presença do valor na ABB");
			System.out.println("5 - Conta quantidade de comparações para pesquisar valores na ABB");
			opcao = le.nextInt();
			
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa!");
				break;
			case 1:
				System.out.print("Valor a ser inserido: ");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println("\n *** Apresentacao da ABB em ordem crescente ***");
				abb.show(abb.root);
				System.out.println("\n");
				break;
			case 3:
				int n = abb.contaNos(abb.root, 0);
				System.out.println("A quantidade de nos na ABB = "+ n);
				break;
			case 4:
				System.out.println("valor a ser pesquisado: ");
				valor = le.nextInt();
				if(abb.consulta(abb.root, valor))
					System.out.println("Valor está presente na ABB");
				else 
					System.out.println("Valor não está presente na ABB");
				break;
			case 5:
				System.out.println("valor a ser pesquisado na ABB: ");
				valor = le.nextInt();
				int cont = abb.contaConsulta(abb.root, valor, 0);
				System.out.println("Quantidade de comparações realizadas: "+ cont);
				  break;
				  
			default:
				System.out.println("Opcao invalida");
	
			}
		} while (opcao != 0);

		le.close();

	}

}
