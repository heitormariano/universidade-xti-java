package br.com.xti.aula018;

import java.util.Scanner;

public class Operador {

	public static void main(String[] args) {
		int idade = 14;
		
		String retorno = (idade >= 18) ? "Maior de idade, cara" : "Menor de idade, moleque";
		// significado da linha de cima: eh analisado se a expressao eh verdadeira. 
		// Se for, "Maior de idade, cara" eh retornado para a variavel. 
		//Se não, "Menor de idade, moleque" eh retornado 
		
		System.out.println("Retorno: " + retorno);
		
		//uso do operador especial ",". 
		//Aplicado para deixar na mesma linha a definicao de variaveis do mesmo tipo
		
		String nome = "Heitor", pais = "Brasil";
		
		System.out.println("Valor nome: " + nome + " e valor pais: " + pais);
		
		//realizando calculos simples
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio:");
		double raio = scanner.nextDouble();
		
		//calculo do diametro. D = 2r
		//double raio = 10;
		
		double diametro = 2 * raio;
		
		System.out.println("Diametro: " + diametro);
		
		
		//circuferencia. C = 2 Pi r
		double pi = Math.PI;
		double circuferencia = 2 * pi * raio;
		
		
		System.out.println("Circuferencia:" + circuferencia);
		
		//elevar 2 a quarta [4] portencia
		double valor = Math.pow(2, 4);
		
		System.out.println("Valor (2 elevado a 4): " + valor);
		
		//Area. A = Pi r2 [raio elevado ao quadrado]
		//forma 1
		double areaCirc = pi * (raio * raio);
		
		//forma 2
		double areaCirc2 = pi * Math.pow(raio, 2);
		
		System.out.println("Area circuferencia: " + areaCirc);
		
		//o resultado eh o mesmo, claro.
		System.out.println("Area circuferencia [forma 2]: " + areaCirc2);
	}
}
