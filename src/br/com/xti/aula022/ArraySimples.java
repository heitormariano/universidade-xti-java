package br.com.xti.aula022;

import java.util.ArrayList;

public class ArraySimples {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		cores.add("vermelho");
		cores.add("amarelo");

		cores.add("laranja");

		cores.add(0, "azul");
		cores.add("preto");

		System.out.println("Elementos lista: " + cores.toString());
		System.out.println("Tamanho lista: " + cores.size());

		System.out.println("Elemento do indice 2: " + cores.get(2));

		System.out.println("Indice do elemento laranja: " + cores.indexOf("laranja"));

		// teste de remocao de um elemento
		cores.remove("amarelo");

		System.out.println("Elementos lista:" + cores.toString());

		System.out.println("Tem o elemento amarelo? " + cores.contains("amarelo"));

		System.out.println("Tem o elemento cinza? " + cores.contains("cinza"));

		System.out.println("Tem o elemento azul? " + cores.contains("azul"));

	}
}
