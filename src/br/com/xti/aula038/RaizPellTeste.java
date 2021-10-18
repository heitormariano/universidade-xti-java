package br.com.xti.aula038;

import java.util.Scanner;

import br.com.xti.aula037.Matematica;

public class RaizPellTeste {

	public static void main(String[] args) {
		
		RaizPell raizPell = new RaizPell();
		
		System.out.println("Digite o numero que deseja extrair a raiz: ");
		
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		int raiz = raizPell.raiz(numero);
		
		System.out.println("Valor da raiz: " + raiz);
		
		//usado a o metodo construido durante a aula
		
		/*RaizPellAula raizPellAula = new RaizPellAula();
		System.out.println("Raiz [uso metodo aula]: " + raizPellAula.raiz(49));*/
	}
}
