package br.com.xti.aula021;

import java.util.Random;

public class AdedonhaNerdSorteio {

	public static void main(String[] args) {
		
		String[] letras = {"A","B","C","D","E","F","G","H","I","J","L","M", 
				"N", "O", "P", "Q","R","S","T", "U", "V", "X", "Z"};
		
		Random r = new Random();
		
		
		System.out.println("Letra para o adedonha Nerd");
		
		int indiceLetra = r.nextInt(letras.length);
		String letra = letras[indiceLetra];
		
		System.out.println(letra);
	}
}
