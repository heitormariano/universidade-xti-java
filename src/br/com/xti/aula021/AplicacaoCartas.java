package br.com.xti.aula021;

import java.util.Random;

public class AplicacaoCartas {

	public static void main(String[] args) {

		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
		String[] nipes = { "Espadas", "Paus", "Copas", "Ouros" };

		// classe Random
		Random r = new Random();

		System.out.println("Escolhendo carta para usuario");

		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];

		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];

		String carta = face + " " + nipe;

		System.out.println(carta);
	}
}
