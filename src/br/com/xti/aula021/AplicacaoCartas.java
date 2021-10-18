package br.com.xti.aula021;

import java.util.Random;

public class AplicacaoCartas {

	public static void main(String[] args) {
		
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		//exemplo - teste
		
		/*String carta = faces[0] + " " + nipes[0];
		
		System.out.println(carta);*/
		
		//classe Random
		
		Random r = new Random();
		
		/*for (int i = 0; i < 10; i++) {
			
			System.out.println(r.nextInt(3));	
		}*/
		
		System.out.println("Escolhendo carta para usuario");
		
		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];
		
		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];
		
		String carta = face + " " + nipe;
		
		System.out.println(carta);
	}
}
