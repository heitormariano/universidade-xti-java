package br.com.xti.aula028;

import java.util.ArrayList;
import java.util.Scanner;

public class Fluxo {

	//estudo while e do while. Sao semelhantes ao for
	
	public static void main(String[] args) {
	
		int num = 0;
		
		// expressao equivale: for (int i=0;i<2;i++)
		while (num < 2){
		
			System.out.println("valor do numero:" + num);
			num ++; // para evitar um loop infinito, precisamos atualizar o valor de "num"
		}
		
		// nessa expressao o que consta no "do" eh executado pelo menos uma vez
		
		int num2 = 3;

		do {
			System.out.println(num2);
		} while (num < 2);

		System.out.println();
		System.out.println("Programa Exemplo");

		ArrayList<String> produtos = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Liste seus produtos e para sair digite FIM");

		String produto;
		
		while (!(produto = scanner.nextLine()).equalsIgnoreCase("fim")) {
			produtos.add(produto);
		}

		System.out.println("Fim do programa");

		System.out.println("Lista de produtos:");
		System.out.println(produtos.toString());
		
		
	}
	
}
