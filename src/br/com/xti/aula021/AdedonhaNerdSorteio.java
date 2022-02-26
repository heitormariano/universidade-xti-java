package br.com.xti.aula021;

import java.util.Random;

public class AdedonhaNerdSorteio {

	public static void main(String[] args) {

		String[] letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };

		Random random = new Random();

		System.out.println("Letra para adedonha Nerd");

		int indiceLetra = random.nextInt(letras.length);
		String letra = letras[indiceLetra];

		System.out.println(letra);
	}
}
