package br.com.xti.aula020;

import java.util.Arrays;

public class ArrayTeste {
	public static void main(String[] args) {
		String[] paises = { "Franca", "Brasil", "Uruguai", "Paraguai", "Argentina" };

		for (String elem : paises) {
			System.out.println(elem);
		}

		int[] numeros = { 2, 4, 5, 6, 7 };
		System.out.println("Array de inteiros: " + Arrays.toString(numeros));

		double[] novosNumeros = { 4.6, 6.6, 7.8, 8.9, 10.2 };

        double numeroBusca = 8.9;
		int posicao = Arrays.binarySearch(novosNumeros, numeroBusca); // binarySearch funciona em arrays ordenados (o caso acima)

		System.out.println("Array novosNumeros: " + Arrays.toString(novosNumeros));
		System.out.println("Posicao do elemento " + numeroBusca + " : " + posicao);

		Double[] valores = { 3.5, 6.6, 8.9, 8.8, 9.3, 5.4 };
		double valorInd3 = valores[3].doubleValue();
		System.out.println("Valor do elemento de indice 3: " + valorInd3);

		Integer[] nValores = { 3, 5, 7, 8, 9 };

		for (Integer elem : nValores) {
			System.out.print(elem.intValue() + " ");
		}
        System.out.println();

        Integer[] valoresInteiros = {100, 5, 6, 50, 40, 1, 2};

        System.out.println("Antes do metodo sort:");
        System.out.println(Arrays.toString(valoresInteiros));

        //ordenar valores
        Arrays.sort(valoresInteiros);

        System.out.println("Depois do metodo sort:\n" + Arrays.toString(valoresInteiros));
	}
}