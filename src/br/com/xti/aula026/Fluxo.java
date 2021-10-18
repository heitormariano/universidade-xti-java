package br.com.xti.aula026;

public class Fluxo {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			System.out.println("Valor da variavel i: " + i);
		}

		String texto = ""; // valor apenas para inicializar a variavel.

		for (int i = 0; i < 4; i++) {

			texto += i + ",";
			// texto = texto + i + ",";
		}

		System.out.println(texto);

		String texto2 = "";

		for (int i = 10; i > 0; i--) {
			texto2 += i + ",";
		}

		System.out.println(texto2);
		
		// verificando todos os numeros pares e impares entre 0 e 20.
		
		System.out.println(); // pular uma linha

		for (int i = 0; i <= 20; i++) {

			if (i % 2 == 0) {
				System.out.println("O numero " + i + " - par");
			} else {
				System.out.println("O numero " + i + " - impar");
			}
		}
		
		//fazendo um quadrado com "*"
		
		//o codigo a seguir permite definir uma linha do quadrado. 
		//O quadrado eh formado por cinco linhas como essa
		
		/*int tamanho = 5;
		for (int i = 0; i < tamanho; i++){
			System.err.print("* ");
		}*/
		
		//O quadrado eh formado por cinco linhas como essa. 
		//Dessa forma, para formar o quadrado, precisamos repetir a instrucao 5 vezes.
		
		System.out.println();

		int tamanho = 5;

		for (int i = 0; i < tamanho; i++) {

			for (int j = 0; j < tamanho; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}
}
