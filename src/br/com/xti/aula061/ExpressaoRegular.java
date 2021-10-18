package br.com.xti.aula061;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {


	public static void main(String[] args) {
		//expressoes regulares sao um padrao de pesquisa no formato String

		String padrao = "java";

		String texto = "java";
		String texto2 = "linguagem massa eh java";

		//saber se dado padrao ocorre ou nao em uma String
		boolean b = texto.matches(padrao);
		boolean b2 = texto2.matches(padrao);

		System.out.println(b);
		System.out.println(b2);

		//economizar linha

		boolean b3 = "cefet".matches("cefet");
		System.out.println(b3);

		//USO DE MODIFICADORES
		/*(?i) Ignora maiúsculas e minúsculas
		 *(?x) comentários
		 *(?m) multilinhas
		 *(?s) dotall ("single-line")
		 * */
		
		//desconsiderando maiúsculas e minúsculas: (?i)
		boolean b4 = "cefet".matches("(?i)CEFET");
		System.out.println(b4);

		//METARACTERES (indicam a ocorrência de numeros,letras, etc) 
		/*
		 * . (qualquer caracter)	[0-9]
		 * \d Dígitos				[^0-9]
		 * \s Espaços				[ \t\n\X0B\f\r]
		 * \S NÃO É ESPAÇO			[^\s]
		 * \w Letra					[a-zA-Z_0-9]
		 * \W NÃO É LETRA			[^\w]
		 * */
		//considerar qualquer caractere na avaliacao
		boolean b5 = "@".matches(".");
		System.out.println("b5, cara: " + b5);

		//considerar numeros entre 0 e 9 na verificacao
		boolean b6 = "5".matches("\\d");
		System.out.println(b6);
		//considerar na verificacao letras [a-z, A-Z] e numeros [0-9]
		boolean b7 = "j".matches("\\w");
		System.out.println(b7);
		boolean b8 = "#".matches("\\w"); // # nao fica entre a e z ou A e Z
		System.out.println("b8 na parada: " + b8);

		//considerar espacos

		boolean b9 = " ".matches("\\s");
		System.out.println(b9);

		//considerar mais de um carectere (2 caracteres, no caso)
		boolean b10 = "Pi".matches("..");
		System.out.println(b10);
		//considerar mais de um digito
		boolean b11 = "123".matches("\\d\\d\\d");
		System.out.println(b11);

		//exemplo de validacao de CEP
		String padraoCep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		String cep = "59100-140";
		boolean b12 = cep.matches(padraoCep);
		System.out.println(b12);

		//QUANTIFICADORES
		boolean b13 = "21".matches("\\d{2}"); //verifica dois digitos
		System.out.println(b13);

		boolean b14 = "21456".matches("\\d{2,}"); //verificar PELO MENOS 2 digitos
		System.out.println(b14);

		boolean b15 = "123456".matches("\\d{2,6}"); //verficar a presenca de no minio 2 digitos e no maximo 6
		System.out.println(b15);

		boolean b16 = "".matches(".?"); //verficar a ocorrencia de qualquer caractere 0 ou 1 vez (uso ?)
		System.out.println(b16);

		boolean b17 = "5".matches("\\d?"); //verficar a ocorrencia de um digito 0 ou 1 vez
		System.out.println(b17);

		boolean b18 = "aaa".matches(".*"); //verficar a ocorrencia de qualquer caractere 0 ou + vezes (uso *)
		System.out.println(b18);

		boolean b19 = "".matches(".+"); //verficar a ocorrencia de qualquer caractere 1 ou + vezes (uso +)
		System.out.println(b19);

		boolean b20 = "ja".matches(".+"); //verficar a ocorrencia de qualquer caractere 1 ou + vezes (uso +)
		System.out.println(b20);

		//refazendo a validacao do CEP
		boolean b21 = "59171-120".matches("\\d{5}-\\d{3}");
		System.out.println(b21);

		//validar uma data

		boolean b22 = "30/05/2012".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println(b22);

		/** Metacaracteres de fronteira

				 ^ -> inicia
				 $ -> termina
				 | -> ou

		 */

		/**
				 identificar a presenta da palavra "massa" no início do texto 
				 e dizer que depois dessa palavra é aceito qualquer 
				 caractere 0 ou + vezes
		 */

		boolean b23 = "massa de mais, cara!".matches("^massa.*");
		System.out.println(b23);

		/**
				 identificar a presenta da palavra "cara!" no final do texto 
				 e dizer que antes dessa palavra é aceito qualquer 
				 caractere 0 ou + vezes
		 */

		boolean b24 = "massa de mais, cara!".matches(".*cara!$");
		System.out.println(b24);

		//semelhante ao código de cima
		boolean b25 = "blz230".matches(".*230$");
		System.out.println(b25);

		/**
			saber se a palavra "java" está mais ou menos pelo meio do texto (nem no início ou no final)
		 */

		boolean b26 = "Tem java aqui".matches(".*java.*");
		System.out.println(b26);

		String texto9000 = "//bla, bla, bla";
		boolean teste = texto9000.matches("^//.*");
		System.out.println(teste);

		/**
		 * saber se o texto começa com dada palavra, 
		 * e termina com outra palavra específica. No meio pode qualquer sequência de caracteres,
		 */

		boolean b27 = "Tem java aqui".matches("^Tem.*aqui$");
		System.out.println(b27);

		//saber se tem o palavra "sim" ou a palavra "nao"
		boolean b28 = "sim".matches("sim|nao");
		System.out.println(b28);

		//saber se tem o palavra "sim" ou a palavra "nao"
		boolean b29 = "nao".matches("sim|nao");
		System.out.println(b29);


		//AGRUPADORES

		//procurar qualquer letra entre "a" e "z". Agrupador [a-z]

		boolean b30 = "#".matches("[a-z]");
		System.out.println(b30);

		//verificar se um caractere está entre a e z
		boolean bb30 = "x".matches("[a-z]");
		System.out.println(bb30);

		boolean b31 = "3".matches("[0-9]");
		System.out.println(b31);

		boolean b32 = "true".matches("[tT]rue"); //avaliar se a palavra começa com t ou T
		System.out.println(b32);

		boolean b33 = "yes".matches("[tT]rue|[yY]es");
		System.out.println(b33);

		/**
		 * verificar se palavra comeca com a primeira letra maiúscula[entre A e Z] e o 
		 *  restante letras minúsculas[entre a e z] 
		 */
		boolean b34 = "Beatriz".matches("[A-Z][a-z]*");
		System.out.println(b34);

		//validar um endereco de e-mail
		boolean b35 = "hm@xtiuniverty.com".matches("\\w+@\\w+\\.\\w{2,3}");
		System.out.println(b35);

		//pensar em como validar quando e-mail termina com ".com.br"
		//uma forma:
		boolean b36 = "hm@xtiuniverty.com.br".matches("\\w+@\\w+\\.\\w{2,3}.*");
		System.out.println(b36);
		//restringir o uso de ".br" no final. Amarrar expressão regular
		//uma forma
		boolean b37 = "hm@xtiuniverty.com.br".matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}");
		System.out.println(b37);

		//mostrar todas as ocorrêcias da palavra doce, independente da forma que ela esteja escrita.

		String doce = "Quel é o Doce mais doCe que o doce?";
		//desconsidera maiúsculas e minúsculas: (?i)
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);

		System.out.println("Palavra doce no texto:");
		while (matcher.find()){
			System.out.println(matcher.group());
		}

		//SUBSTITUIÇÔES
		//substituir toda ocorrência da palavra doce por docinho.

		String resultado = doce.replaceAll("(?i)doce", "docinho");
		System.out.println(resultado);

		String rato = "O rato roeu a roupa do rei de roma";
		String resultado2 = rato.replaceAll("r[aeiou]", "PA");
		System.out.println(resultado2);

		//trocar os espaços por tabulação
		String resultado3 = "Tabular este texto".replaceAll("\\s", "\t");
		System.out.println(resultado3);

		String url = "www.xti.com.br/clientes-2011.html";

		//as páginas precisam ficar no seguinte padrão agora:
		// --> http://www.xti.com.br/2011/clientes.jsp

		//String regex = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		//System.out.println(url.matches(regex));

		//tornar o texto "www.xti.com.br" numa variável. Para isso, basta colocar entre parênteses.
		//como é preciso recuperar o nome da página (clientes) e o ano (2011) da url, novas variáveis são criadas.

		String regex = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		//recuperar as variáveis. Exemplo de acesso a primeira variável: $1

		String novaUrl = url.replaceAll(regex, "http://$1/$3/$2.jsp");
		System.out.println(novaUrl);
		System.out.println("url antiga: " + url);

	}

}
