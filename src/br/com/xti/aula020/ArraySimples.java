package br.com.xti.aula020;

import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {

		// foma 1 para inicializar [preencher] o array de paises.
		String[] paises = { "Brasil", "China", "Holanda", "Uruguai", "Chile" };

		System.out.println("Valor do elemento de indice 0: " + paises[0]);

		paises[0] = "BRAZIL";

		System.out.println("Valor do elemento de indice 0: " + paises[0]);
		System.out.println("Tamanho do array de paises: " + paises.length);

		// uso da classe Arrays

		System.out.println("Array de paises: " + Arrays.toString(paises));
		// saber se existe dado elemento no array com a classe Arrays
		int posicao = Arrays.binarySearch(paises, "China");

		System.out.println("Posicao do elemento China do Array: " + posicao);

		// ordenar o array com a classe Arrays

		Arrays.sort(paises, 0, paises.length);
		System.out.println("Array de paises Ordenado: " + Arrays.toString(paises));

		Double[] valores = { 23.45, 24.66 };

		double ind0 = valores[0].doubleValue();

		System.out.println("Valor do indice 0 do array: " + ind0);

		// array de numeros impares

		// forma 2 de inicializar
		int[] impares = new int[5];

		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;

		// Uso da classe Arrays

		System.out.println("Array de numeros impares: " + Arrays.toString(impares));

	}
}
