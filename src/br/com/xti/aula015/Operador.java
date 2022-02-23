package br.com.xti.aula015;

public class Operador {

	public static void main(String[] args) {
		// comparacao de igualdade entre valores: usamos "=="

		int x = 9;
		int y = 9;

		System.out.println("x eh igual a y? " + (x == y));

		System.out.println("x eh diferente de y? " + (x != y));

		System.out.println("x eh maior que y? " + (x > y));

		System.out.println("x eh maior ou igual a y? " + (x >= y));

		System.out.println("x eh menor ou igual a y? " + (x <= y));

		if (x == y) {
			System.out.println("O valor de x eh igual a y");
		}

		// uso de intanceof

		Integer num = 10;

		System.out.println("valor boolean retornado: " + (num instanceof Integer));

		if (num instanceof Integer) {

			System.out.println("A variavel [operando] num eh do tipo Integer, " + "eh uma instancia da classe Integer");
		}

		// outro exemplo de uso de instanceof
		String texto = "massa";

		System.out.println(texto instanceof String);

	}
}
