package br.com.xti.aula021;

import java.util.Arrays;

public class ArrayMultidimensional {

	public static void main(String[] args) {

		// trabalhando com arrays multidiomensionais

		// array com uma dimensao
		String[] arraySimples = { "Heitor", "Patricia", "Fabiola", "Adelson" };

        System.out.println("Array Simples: " + Arrays.toString(arraySimples));

		// array com duas dimensoes
		String[][] arrayDados = { { "Heitor", "M", "RN" }, { "Keyth", "F", "RN" } };

		// acessando elementos do array de duas dimensoes
		System.out.println("Array da 1a dimensao. Acesso ao 1 elemento");

		System.out.println(arrayDados[0][0]);

		System.out.println("Array da 2a dimensao. Acesso ao 1 elemento");

		System.out.println(arrayDados[1][0]);

		// tamanho do array. O arrayDois possui dois elementos, os dois arrays
		System.out.println("Qtd elementos do Array [geral]: " + arrayDados.length);

		// tamanho do primeiro array interno
		System.out.println("Tamanho do Primeiro Array interno: " + arrayDados[0].length);

		// tamanho do segundo array interno
		System.out.println("Tamanho do Segundo Array interno: " + arrayDados[1].length);

		// mudando elementos dos arrays internos

		System.out.println("Primeiro Array Interno. Novo valor do primeiro elemento:");
		arrayDados[0][0] = "HEITOR";
		System.out.println(arrayDados[0][0]);

		System.out.println("Segundo Array Interno. Novo valor do primeiro elemento:");
		arrayDados[1][0] = "KEYTH";
		System.out.println(arrayDados[1][0]);

	}

}
