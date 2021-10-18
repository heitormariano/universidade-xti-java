package br.com.xti.aula042;

public class MatematicaTeste {

	public static void main(String[] args) {
		Matematica matematica = new Matematica();

		int numMaior = matematica.maior(5, 10);

		System.out.println("Maior numero: " + numMaior);

		double soma = matematica.soma(10, 20);

		System.out.println("Soma de dois numeros " + soma);

		// saber a soma do maior numero par com o maior numero impar

		int maiorPar = matematica.maior(2, 4);
		int maiorImpar = matematica.maior(3, 5);

		// outra forma

		/*
		 * double somaMaiores2 = matematica.soma(matematica.maior(2, 4),
		 * matematica.maior(3, 5));
		 */

		double somaMaiores = matematica.soma(maiorPar, maiorImpar);

		System.out.println("Soma do maior numero " + "par com o maior numero impar: " + somaMaiores);

		// testando o metodo soma, recebendo mais que dois argumentos

		double totalUm = matematica.soma(1, 2, 3, 4);
		double totalDois = matematica.soma(1, 2, 3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);

		System.out.println("Teste Um - Total: " + totalUm);
		System.out.println("Teste Um - Total: " + totalDois);

		// para usar o metodo somaArray eh preciso definir o array de elementos
		// que precisam ser somados.

		double[] numeros = { 2, 4, 5, 6, 7, 8, 9, 10 };
		double totalTres = matematica.somaArray(numeros);
		System.out.println("Soma dos alementos do Array: " + totalTres);

		// testando outro metodo de soma. Esse recebe também uma String

		double totalQuatro = matematica.soma("Soma de valores:", 2, 3, 4, 5, 6, 6, 7, 7, 8);

		System.out.println(totalQuatro);

	}
}
