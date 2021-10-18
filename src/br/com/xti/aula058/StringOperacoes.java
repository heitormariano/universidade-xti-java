package br.com.xti.aula058;

public class StringOperacoes {

	public static void main(String[] args) {
		String s1 = "write once";
		String s2 = s1 + "Run AnyWhere";
		String s3 =  new String ("Java Virtual Machine");
		
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		//OPERAÇÔES
		int tamanho = s1.length();
		char letra = s1.charAt(0); //saber o caractere no indice 0. Valores de indice: 0 até length()-1
		String texto = s1.toString();
		
		//LOCALIZAÇÂO
		int posicao = s3.indexOf('J');
		
		System.out.println(posicao);
		s3.lastIndexOf('a'); //a posicao do ultimo 'a' que aparece na string
		
		int posicao2 = s3.indexOf("Virtual"); //considera a aparicao para primeira letra. No caso, a 'V'
		System.out.println(posicao2);
		
		boolean vazia = s3.isEmpty();
		System.out.println(vazia);
		
		//COMPARAÇÂO
		String xti = "XTI";
		boolean mesmoValor = xti.equals("xti"); //compara os valores de duas strings.
		System.out.println(mesmoValor);
		//O "==" é usado para verificar se a referência entre dois objetos é a mesma. 
		//É para saber se os objetos são iguais e não o valor.
		
		boolean mesmoValor2 = xti.equalsIgnoreCase("xti");
		System.out.println(mesmoValor2);
		
		boolean comeca = xti.startsWith("XT"); //saber se a string começa com dado valor fornecido.
		System.out.println(comeca);

		boolean comeca2 = xti.startsWith("TI");
		System.out.println(comeca2);
		
		boolean termina = xti.endsWith("TI"); //saber se a string termina com dado valor
		System.out.println(termina);
		
		boolean termina2 = xti.endsWith("X");
		System.out.println(termina2);

		System.out.println("---------- Uso de compareTo ----------");
		
		int vemAntes = "amor".compareTo("bola"); // a palavra amor vem antes ou depois da palava bola. Resposta: antes (a letra a vem antes da letra b)
		// é retornado -1 para dizer que a string é menor (vem antes) que a outra.
		
		System.out.println(vemAntes);
		
		int vemAntes2 = "carteira".compareTo("branco");
		System.out.println(vemAntes2);
		
		int vemAntes3 = "carteira".compareTo("almofada");
		System.out.println(vemAntes3);
		
		int vemAntes4 = "abcde".compareTo("abcdef"); // a segunda string (passada como parametro) tem apenas uma letra diferente que é o "f"
		System.out.println(vemAntes4);
		
		int mesmaPalavra = "amor".compareTo("amor"); //Nesse caso não existe palavra que vem antes ou depois, pois se trata da mesma palavra
		// o valor retornado é 0
		System.out.println(mesmaPalavra);
		
		//comparando "números" (string com números) com compareTo().
		int compara = "1234".compareTo("5678"); 
		// o valor retornado é menor que 0 para dizer que a string é menor que a outra
		System.out.println(compara);
		System.out.println("---------- Fim de uso de compareTo ----------");
		
		String s5 = "olhe, olhe!";
		boolean compara2 = s5.regionMatches(6, "OLHE", 0, 4); // saber de uma string está numa região específica de outra string
		System.out.println(compara2);
		
		//argumento 1: indice da posição da string (s5) de referência para a verificação (avaliação da presença ou não de uma string em outra). 
		//Começarei a partir de qual posição para fazer a verificação? (em outras palavras)
		//argumento 2: a string que desejo saber se está presente (olhe)
		//argumento 3: indica base da string (olhe) que queremos saber se está em dada String. Exemplo: olhe (indice 0 = "o" )
		//argumento 4: tamanho considerado para a string base (olhe) para verficação. Exemplo: foi considerado o tamanho total da string "olhe". 
		//Foi repasso como parâmetro o valor 4 (número de caracteres total)
		
		
		//mesma coisa do método de cima, mas o primeiro argumento agora é para 
		//desconsiderar maiúsculas e minúsculas na verficação
		String s6 = "rapaz, rapaz!";
		boolean compara3 = s6.regionMatches(true, 7, "RAPAZ", 0, 5); //saber se uma string está numa região específica de outra string
		System.out.println(compara3);
		
		String frease = "rapaz. A palavra aparece. Novamente a palavra rapaz.";
		boolean resultado = frease.regionMatches(0, "rapaz", 0, 5);
		System.out.println(resultado);
		
		//EXTRÇÂO DE DADOS
		
		String brasil = "O Brasil é lindo";
		
		//obter substring a partir de uma string. É informado o índice inicial. É considerado esse índice em diante para a substring.
		String subBrasil = brasil.substring(9);
		System.out.println(subBrasil);
		
		//obtendo uma substring definindo o índice inicial e final - 1 usado
		String subBrasil2 = brasil.substring(2, 8);
		System.out.println(subBrasil2);
		
		//CODIFICAÇÂO
		
		//concatenar strings
		String concatena = brasil.concat(" e bacana de morar");
		//o método de cima equivale a este: brasil += "e bacana de morar";
		
		System.out.println(concatena);
		
		String substituicao = brasil.replace('l', 'L'); // trocar o l por L
		System.out.println(substituicao);
		
		String palavra = "Massa"; 
		String mudanca = palavra.replace('a', 'A'); // existe mais de um 'a' na String. Nesse caso, todas as ocorrências são trocadas por 'A'
		System.out.println(mudanca);
		
		String substituicao2 = brasil.replaceFirst(" ", "X"); //na primeira aparição de espaço, substituir por X
		System.out.println(substituicao2);
		
		String substituicao3 = brasil.replaceAll(" ", "X"); //substituir todos os espaços que aparecem por X
		System.out.println(substituicao3);
		
		String maiuscula = brasil.toUpperCase();
		System.out.println(maiuscula);
		
		String minuscula = brasil.toLowerCase();
		System.out.println(minuscula);
		
		//tirar os espaços em branco antes (começo) e depois (fim) da string
		String espacos = "    espaco pra caramba          ";
		String semEspacos = espacos.trim();
		System.out.println(semEspacos);
	}
}