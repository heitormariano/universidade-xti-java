package br.com.xti.aula025;

import java.util.Random;
import java.util.Scanner;

public class JogoDados {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Jogo de dados!");

		System.out.println("Digite um palpite [entre 1 e 6]:");

		int palpite = scanner.nextInt();

		Random r = new Random();

		// int numDado = r.nextInt(6); //possibilidades: 0 ate 5.

		int numDado = r.nextInt(6) + 1;

		System.out.println("Valor do dado: " + numDado);

		if (palpite == numDado) {
			System.out.println("Palpite correto. Voce acertou o numero do dado");
		} else {
			System.out.println("Tente de novo. Palpite incorreto");
		}
	}
}
