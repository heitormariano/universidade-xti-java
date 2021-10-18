package br.com.xti.aula058;

public class StringOperacoes {

	public static void main(String[] args) {
		String s1 = "write once";
		String s2 = s1 + "Run AnyWhere";
		String s3 =  new String ("Java Virtual Machine");
		
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		//OPERA��ES
		int tamanho = s1.length();
		char letra = s1.charAt(0); //saber o caractere no indice 0. Valores de indice: 0 at� length()-1
		String texto = s1.toString();
		
		//LOCALIZA��O
		int posicao = s3.indexOf('J');
		
		System.out.println(posicao);
		s3.lastIndexOf('a'); //a posicao do ultimo 'a' que aparece na string
		
		int posicao2 = s3.indexOf("Virtual"); //considera a aparicao para primeira letra. No caso, a 'V'
		System.out.println(posicao2);
		
		boolean vazia = s3.isEmpty();
		System.out.println(vazia);
		
		//COMPARA��O
		String xti = "XTI";
		boolean mesmoValor = xti.equals("xti"); //compara os valores de duas strings.
		System.out.println(mesmoValor);
		//O "==" � usado para verificar se a refer�ncia entre dois objetos � a mesma. 
		//� para saber se os objetos s�o iguais e n�o o valor.
		
		boolean mesmoValor2 = xti.equalsIgnoreCase("xti");
		System.out.println(mesmoValor2);
		
		boolean comeca = xti.startsWith("XT"); //saber se a string come�a com dado valor fornecido.
		System.out.println(comeca);

		boolean comeca2 = xti.startsWith("TI");
		System.out.println(comeca2);
		
		boolean termina = xti.endsWith("TI"); //saber se a string termina com dado valor
		System.out.println(termina);
		
		boolean termina2 = xti.endsWith("X");
		System.out.println(termina2);

		System.out.println("---------- Uso de compareTo ----------");
		
		int vemAntes = "amor".compareTo("bola"); // a palavra amor vem antes ou depois da palava bola. Resposta: antes (a letra a vem antes da letra b)
		// � retornado -1 para dizer que a string � menor (vem antes) que a outra.
		
		System.out.println(vemAntes);
		
		int vemAntes2 = "carteira".compareTo("branco");
		System.out.println(vemAntes2);
		
		int vemAntes3 = "carteira".compareTo("almofada");
		System.out.println(vemAntes3);
		
		int vemAntes4 = "abcde".compareTo("abcdef"); // a segunda string (passada como parametro) tem apenas uma letra diferente que � o "f"
		System.out.println(vemAntes4);
		
		int mesmaPalavra = "amor".compareTo("amor"); //Nesse caso n�o existe palavra que vem antes ou depois, pois se trata da mesma palavra
		// o valor retornado � 0
		System.out.println(mesmaPalavra);
		
		//comparando "n�meros" (string com n�meros) com compareTo().
		int compara = "1234".compareTo("5678"); 
		// o valor retornado � menor que 0 para dizer que a string � menor que a outra
		System.out.println(compara);
		System.out.println("---------- Fim de uso de compareTo ----------");
		
		String s5 = "olhe, olhe!";
		boolean compara2 = s5.regionMatches(6, "OLHE", 0, 4); // saber de uma string est� numa regi�o espec�fica de outra string
		System.out.println(compara2);
		
		//argumento 1: indice da posi��o da string (s5) de refer�ncia para a verifica��o (avalia��o da presen�a ou n�o de uma string em outra). 
		//Come�arei a partir de qual posi��o para fazer a verifica��o? (em outras palavras)
		//argumento 2: a string que desejo saber se est� presente (olhe)
		//argumento 3: indica base da string (olhe) que queremos saber se est� em dada String. Exemplo: olhe (indice 0 = "o" )
		//argumento 4: tamanho considerado para a string base (olhe) para verfica��o. Exemplo: foi considerado o tamanho total da string "olhe". 
		//Foi repasso como par�metro o valor 4 (n�mero de caracteres total)
		
		
		//mesma coisa do m�todo de cima, mas o primeiro argumento agora � para 
		//desconsiderar mai�sculas e min�sculas na verfica��o
		String s6 = "rapaz, rapaz!";
		boolean compara3 = s6.regionMatches(true, 7, "RAPAZ", 0, 5); //saber se uma string est� numa regi�o espec�fica de outra string
		System.out.println(compara3);
		
		String frease = "rapaz. A palavra aparece. Novamente a palavra rapaz.";
		boolean resultado = frease.regionMatches(0, "rapaz", 0, 5);
		System.out.println(resultado);
		
		//EXTR��O DE DADOS
		
		String brasil = "O Brasil � lindo";
		
		//obter substring a partir de uma string. � informado o �ndice inicial. � considerado esse �ndice em diante para a substring.
		String subBrasil = brasil.substring(9);
		System.out.println(subBrasil);
		
		//obtendo uma substring definindo o �ndice inicial e final - 1 usado
		String subBrasil2 = brasil.substring(2, 8);
		System.out.println(subBrasil2);
		
		//CODIFICA��O
		
		//concatenar strings
		String concatena = brasil.concat(" e bacana de morar");
		//o m�todo de cima equivale a este: brasil += "e bacana de morar";
		
		System.out.println(concatena);
		
		String substituicao = brasil.replace('l', 'L'); // trocar o l por L
		System.out.println(substituicao);
		
		String palavra = "Massa"; 
		String mudanca = palavra.replace('a', 'A'); // existe mais de um 'a' na String. Nesse caso, todas as ocorr�ncias s�o trocadas por 'A'
		System.out.println(mudanca);
		
		String substituicao2 = brasil.replaceFirst(" ", "X"); //na primeira apari��o de espa�o, substituir por X
		System.out.println(substituicao2);
		
		String substituicao3 = brasil.replaceAll(" ", "X"); //substituir todos os espa�os que aparecem por X
		System.out.println(substituicao3);
		
		String maiuscula = brasil.toUpperCase();
		System.out.println(maiuscula);
		
		String minuscula = brasil.toLowerCase();
		System.out.println(minuscula);
		
		//tirar os espa�os em branco antes (come�o) e depois (fim) da string
		String espacos = "    espaco pra caramba          ";
		String semEspacos = espacos.trim();
		System.out.println(semEspacos);
	}
}