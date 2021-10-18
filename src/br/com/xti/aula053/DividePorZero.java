package br.com.xti.aula053;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		boolean continua = true;
		
		do{
			try {
				
				System.out.println("Numero: ");
				int a = ler.nextInt();
				
				System.out.println("Divisor: ");
				int b = ler.nextInt();
			
				System.out.println("Resultado divisao: " + a/b);
				continua = false;
				
			} catch (InputMismatchException e1) {
				System.err.println("Os numeros devem ser inteiros");
				ler.nextLine(); //descarta a entrada errada e libera novamente para o usuario
				
			} catch (ArithmeticException e2) {
				System.err.println("Divisor deve ser diferente de zero");
			}
			finally{
				// o finally sempre eh exexutado, independe de ter ocorrido erro ou nao
				//normalmente usado para limpar variaveis, fechar conexoes, fechar streams de dados, etc
				System.out.println("Finally executado ...");
			}
		} while(continua);
	}
}
