package br.com.xti.aula021;

public class ArraySimples {

	public static void main(String[] args) {

		// trabalhando com arrays multidiomensionais

		// array com uma dimensao
		String[] arrayUm = { "Heitor", "Patricia", "Fabiola", "Adelson" };

		// array com duas dimensoes
		String[][] arrayDois = { { "Heitor", "M", "RN" }, { "Keyth", "F", "RN" } };

		// acessando elementos do array de duas dimensoes
		System.out.println("Array da 1ª dimensao. Acesso ao 1 elemento");

		System.out.println(arrayDois[0][0]);

		System.out.println("Array da 2ª dimensao. Acesso ao 1 elemento");

		System.out.println(arrayDois[1][0]);

		// tamanho do array. O arrayDois possui dois elementos, os dois arrays
		System.out.println("Qtd elementos do Array [geral]: " + arrayDois.length);

		// tamanho do primeiro array interno
		System.out.println("Tamanho do Primeiro Array interno: " + arrayDois[0].length);

		// tamanho do segundo array interno
		System.out.println("Tamanho do Segundo Array interno: " + arrayDois[1].length);

		// mudando elementos dos arrays internos

		System.out.println("Primeiro Array Interno. Novo valor do primeiro elemento:");
		arrayDois[0][0] = "HEITOR";
		System.out.println(arrayDois[0][0]);

		System.out.println("Segundo Array Interno. Novo valor do primeiro elemento:");
		arrayDois[1][0] = "KEYTH";
		System.out.println(arrayDois[1][0]);

	}

}
