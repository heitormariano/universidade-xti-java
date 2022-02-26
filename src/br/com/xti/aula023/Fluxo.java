package br.com.xti.aula023;

public class Fluxo {

	public static void main(String[] args) {

		int num = 11;

		if (num % 2 == 0) {
			System.out.println("Numero Par");
		} else {
			System.out.println("Numero Impar");
		}

		int idade = 89;

		if (idade <= 11) {
			System.out.println("Crianca");
		} else if (idade > 11 && idade <= 18) {
			System.out.println("Adolescente");
		} else if (idade > 18 && idade <= 60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Melhor idade");
		}

		double nota = 5;

		if (nota >= 7) {
			System.out.println("Passou");
		} else {
			System.out.println("Nao Passou");
			// uso de if dentro do else.
			if (nota >= 6) {
				System.out.println("Fazer prova de recuperacao");
			}
		}
	}
}
