package br.com.xti.aula054;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZeroThrows {
	public static void dividir(Scanner leitor) throws InputMismatchException, ArithmeticException {
		System.out.println("Numero: ");
		int a = leitor.nextInt();

		System.out.println("Divisor: ");
		int b = leitor.nextInt();

		int resultado = a / b;
		System.out.println("Resultado divisao: " + resultado);
	}

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		boolean continua = true;

		do {
			try {
				dividir(ler);
				continua = false;

			} catch (InputMismatchException e1) {
				System.err.println("Os numeros devem ser inteiros");
				e1.printStackTrace();
				ler.nextLine();

			} catch (ArithmeticException e2) {
				System.err.println("Divisor deve ser diferente de zero");
				e2.printStackTrace();
			} finally {
				System.out.println("Finally executado ...");
			}
		} while (continua);
	}
}
