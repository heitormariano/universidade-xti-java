package br.com.xti.aula027;

import java.util.ArrayList;

public class Fluxo {

	public static void main(String[] args) {

		int[] pares = { 2, 4, 6, 8 };

		System.out.println("Numeros pares:");

		for (int i = 0; i < pares.length; i++) {
			int par = pares[i];
			System.out.println(par);
		}

		System.out.println("Numeros pares [uso do foreach]:");

		// recuperando cada elemento do array de numeros pares
		for (int numPar : pares) {
			System.out.println(numPar);
		}

		System.out.println();

		System.out.println("Elementos da lista:");
		ArrayList<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}
        
		for (int numero : lista) {
			System.out.println(numero);
		}

	}
}
