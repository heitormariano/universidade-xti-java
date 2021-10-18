package br.com.xti.aula048;

public class Cachorro extends Animal {

	
	public Cachorro(){
		//super faz referencia a superclasse. Com o super podemos acessar o construtor da classe pai.
		//No caso, sera usado o construtor da classe Animal
		super(30, "carne");
		
		//acessando metodo da superclasse
		//super.dormir();
	}
}
