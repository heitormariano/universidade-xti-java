package br.com.xti.aula028;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fluxo {

	// estudo while e do while. Sao semelhantes ao for

	public static void main(String[] args) {

		int num = 0;

		// expressao equivale: for (int i=0;i<2;i++)
		while (num < 2) {

			System.out.println("valor do numero:" + num);
			num++; // para evitar um loop infinito, precisamos atualizar o valor de "num"
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

		System.out.println("Fim da recuperacao dos nomes dos produtos\n");

		System.out.println("Lista de nomes obtida");
		System.out.println(produtos.toString());

		int numLer = -1;
		List<Integer> numeros = new ArrayList<Integer>();

		System.out.println("Informe os numeros que desejar. Digite 0 para finalizar");
		while ((numLer = scanner.nextInt()) != 0) {
			numeros.add(numLer);
		}
		System.out.println("Fim da recuperacao dos numeros\n");

		// usando programacao declativa
		System.out.println("Numeros informados:");
		numeros.stream().collect(Collectors.toList()).forEach(System.out::println);
	}

}
