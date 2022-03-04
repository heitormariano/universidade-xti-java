package br.com.xti.aula037;

public class MatematicaTeste {

	public static void main(String[] args) {
		Matematica matematica = new Matematica();

		int maiorNumero = matematica.maior(5, 10);

		System.out.println("Maior numero: " + maiorNumero);

		double soma = matematica.soma(10, 20);

		System.out.println("Soma de dois numeros " + soma);

		// saber a soma do maior numero par com o maior numero impar

		int maiorPar = matematica.maior(2, 4);
		int maiorImpar = matematica.maior(3, 5);

		double somaMaiores = matematica.soma(maiorPar, maiorImpar);

		// outra forma

		/*
		 * double somaMaiores2 = matematica.soma(matematica.maior(2, 4),
		 * matematica.maior(3, 5));
		 */

		System.out.println("Soma do maior numero par" + "(" + maiorPar + ")" + " com o maior numero impar" + "("
				+ maiorImpar + ")" + ": " + somaMaiores);
	}
}
