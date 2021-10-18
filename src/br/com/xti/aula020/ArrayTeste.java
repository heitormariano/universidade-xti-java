package br.com.xti.aula020;
import java.text.DecimalFormat;
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
		int posicao = Arrays.binarySearch(novosNumeros, 8.9);
		
		double num = 8.9;

		System.out.println("Array novosNumeros: " + Arrays.toString(novosNumeros));
		System.out.println("Posicação do elemento 8.9: " + posicao);

		Double[] valores = { 3.5, 6.6, 8.9, 8.8, 9.3, 5.4 };
		double valorInd3 = valores[3].doubleValue();
		System.out.println("Valor do elemento índice 3: " + valorInd3);
		
		Integer[] nValores = {3,5,7,8,9};
		
		for(Integer elem : nValores){
			System.out.println(elem.intValue());
		}
		
		/*String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);
		double numGrande = 5.8982353453465656;
		System.out.println(df.format(numGrande));*/
	}
}