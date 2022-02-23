package br.com.xti.aula016;

public class Operador {

	public static void main(String[] args) {

		int x = 6;

		System.out.println(x >= 1 && x <= 10);

		System.out.println(x >= 7 && x <= 10);

		System.out.println(x >= 7 || x <= 10);

		System.out.println(x >= 7 || x <= 5);

		// fazendo a negacao.
		// x == 6 retorna "true", mas com a negacao o resultado final eh "false"

		System.out.println(!(x == 6));

	}
}
