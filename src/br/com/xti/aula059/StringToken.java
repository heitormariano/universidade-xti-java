package br.com.xti.aula059;

public class StringToken {

	// Tokeniza��o: processo de separa��o de dados em peda�os menores
	// tokens: palavras
	// delimitadores: pode ser, por exemplo, um ";"

	public static void main(String[] args) {

		String separar = "XTHML; CSS; JavaScript; JQuery; JAVA";
		String[] tokens = separar.split(";"); // recebe uma express�o regular

		int numTokens = tokens.length;
		System.out.println("numero tokens[palavras]: " + numTokens);

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}

		String exemplo = "Eu vou trabalhar no CEFET";
		String[] tokens2 = exemplo.split(" ");

		int numTokens2 = tokens2.length;
		System.out.println("numero tokens[palavras]:" + numTokens2);

		for (int i = 0; i < tokens2.length; i++) {
			System.out.println(tokens2[i]);
		}
		System.out.println();
		for (String palavra : tokens) {
			System.out.println(palavra);
		}
		System.out.println();
		for (String palavra : tokens2) {
			System.out.println(palavra);
		}
	}
}
