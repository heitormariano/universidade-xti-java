package br.com.xti.aula014;

public class Operador {

	public static void main(String[] args) {

		double num = 7 + 4;
		double num2 = 3 * 6;

		System.out.println(num);
		System.out.println(num2);

		// concatenando Strings

		String texto = "Oi," + "Professor Heitor";
		System.out.println(texto);

		// encontrar o resto da divisao entre dois numeros

		double resto = 8 % 2;
		double resto2 = 7 % 3;

		System.out.println(resto);

		System.out.println(resto2);

		/*
		 * if (resto == 0.0){ System.out.println("O numero eh par"); }else
		 * System.out.println("O numero eh impar");
		 * 
		 * if (resto2 == 0.0){ System.out.println("O numero eh par"); }else
		 * System.out.println("O numero eh impar");
		 */

		double numPositivo = +4;

		double numNegativo = -6;

		System.out.println(numPositivo);
		System.out.println(numNegativo);

		double num3 = -(-8);

		double num4 = -(+5);

		System.out.println(num3);
		System.out.println(num4);

		// incrementando o valor de operandos

		int x = 6;

		int y = ++x; // pre-incremento. Valor eh incrementando nesta linha.

		System.out.println("valor de x:" + x);
		System.out.println("valor de y:" + y);

		int z = 10;

		int w = z++; // pos-incremento. Valor eh incrementado apenas na linha seguinte do programa

		System.out.println("valor de z:" + z);
		System.out.println("valor de w:" + w);

		// decrementando o valor de operandos

		double t = 4;

		double v = --t;

		System.out.println("Valor de t: " + t);
		System.out.println("Valor de v: " + v);

		double a = 10;

		double b = a--;

		System.out.println("Valor de a: " + a);
		System.out.println("Valor de b: " + b);

	}
}
