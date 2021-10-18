package br.com.xti.aula051;

//quando definimos o modificador final numa classe significa que ela nao podera mais ser herdada
//public final class Cachorro extends Animal{
public class Cachorro extends Animal {

	
	public Cachorro(){
		super(30, "carne");
	}
	
	//quandoo o modificados final eh usando em um 
	//metodo significa que ele nao pode ser modificado pela subclasse, ou seja, sobrescrito
	@Override
	public final void fazerBarulho() {
		System.out.println("Au, Au!");
	}
	
	public final void correr(){
		System.out.println("Correndo...");
	}
}
