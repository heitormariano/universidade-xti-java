package br.com.xti.aula054;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		boolean continua = true;

		do {
			try {

				System.out.println("Numero: ");
				int a = ler.nextInt();

				System.out.println("Divisor: ");
				int b = ler.nextInt();

				System.out.println("Resultado divisao: " + a / b);
				continua = false;

			} catch (InputMismatchException e1) {
				System.err.println("Os numeros devem ser inteiros");
				e1.printStackTrace();
				// e1.getMessage(); //retorna uma mensagem (em geral contendo a lista de erros)
				// e1.getStackTrace(); //captura o array de stack traces (erros identificados)
				ler.nextLine(); // descarta a entrada errada e libera novamente para o usuario

			} catch (ArithmeticException e2) {
				System.err.println("Divisor deve ser diferente de zero");
				e2.printStackTrace();

				// System.out.println(e2.getStackTrace());
				// System.out.println(e2.getMessage());
			}

			// o multi catch (tratar mais de uma excecao no mesmo bloco catch) eh permitido
			// a partir do java 7
			/*
			 * catch (InputMismatchException | ArithmeticException e1) {
			 * System.err.println("Numero invalido"); ler.nextLine();
			 */
			finally {
				// o finally sempre eh exexutado, independe de ter ocorrido erro ou nao
				// normalmente usado para limpar variaveis, fechar conexoes, fechar streams de
				// dados, etc
				System.out.println("Finally executado ...");
			}
		} while (continua);

	}
}
