package br.com.xti.aula086;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList<String>();
		
		collection.add("A");
		collection.add("B");
		collection.add("C");
		
		System.out.println(collection.toString());
		System.out.println(collection.isEmpty());
		System.out.println(collection.contains("A"));
		
		collection.remove("A");
		System.out.println(collection.toString());
		
		/*Grupos de elementos*/
		
		//convertendo array numa coleção
		Collection<String> collection2 = Arrays.asList("D", "E");
		collection.addAll(collection2);
		
		System.out.println(collection.toString());
		/* verfica se a primeira coleção contém todos os elementos da segunda coleção */
		System.out.println(collection.containsAll(collection2)); 
		
		collection.removeAll(collection2);
		System.out.println(collection);
		
		/*percorrer os elementos de uma array*/
		
		for (String elemento : collection){
			System.out.println(elemento);
		}
		
		//convertendo uma coleção num array
		String[] s = collection.toArray(new String[collection.size()]);
		System.out.println(Arrays.toString(s));
		
		//limpando a coleção
		collection.clear();
		System.out.println(collection);
	}
}
