package br.com.xti.aula050;

//Os m�todos abstratos s� podem existir em uma classe abstrata
//Uma classe abstrata � um tipo de classe que n�o pode ser instanciada
//Heran�a entre classes abstratas: Uma classe abstrata n�o precisa implementar os 
//m�todos abstratos da sua superclasse abstrata

public abstract class Animal {

	private double peso;
	private String comida;
	
	// m�todo construtor
	/*
	* Classes Abstratas podem ter m�todos construtores,
	* mas n�o podem ser usados para instanciar um objeto diretamente
	* 	*/
	
	public Animal(double peso, String comida){
		this.comida = comida;
		this.peso = peso;
	}
	
	//classe abstrata pode ter m�todos n�o abstratos
	public void dormir (){System.out.println("Dormiu!");}
	
	//metodo abstrato. 
	//As classes concretas que herdam a classe abstrata sao obrigados a implementar(sobrescrever) o m�todo
	public abstract void fazerBarulho ();
	
	//classe abstrata pode ter m�todos n�o abstratos
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
}
