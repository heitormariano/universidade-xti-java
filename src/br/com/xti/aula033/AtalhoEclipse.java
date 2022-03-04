package br.com.xti.aula033;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AtalhoEclipse {

	public static void atalhosEclipseExemplo() {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite uma palavra:");
		String palavra = leitor.nextLine();

		System.out.println("Palavra informada: " + palavra);

		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < array.length; i++) {
			System.out.println("Elemento: " + i);
		}

		List<String> lista = new ArrayList<String>();
		lista = Arrays.asList("Joao", "Pedro", "Tiago");

		for (String elem : lista) {
			System.out.println(elem);
		}

	}

	public static void main(String[] args) {
		System.out.println("Aula voltada para atahos do Eclipse");

		System.out.println("Usando metodo criado...");
		atalhosEclipseExemplo();
	}
}
