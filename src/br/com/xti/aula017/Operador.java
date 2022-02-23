package br.com.xti.aula017;

public class Operador {

	public static void main(String[] args) {
		// operadores de atribuicao em Java

		int x = 10;

		x += 4;

		int y = 20;

		y += 2;

		System.out.println("valor de x: " + x);

		System.out.println("valor de y: " + y);

		int z = 10;

		z -= 3;

		System.out.println("Valor de z: " + z);

		int z2 = 5;

		z2 *= 2;

		System.out.println("valor de z2: " + z2);

		int w = 10;

		w /= 2;

		System.out.println("valor de w: " + w);

		int w2 = 10;

		w2 %= 2; // o resto da divisao de 10 por 2

		System.out.println("valor de w: " + w2);
	}
}
