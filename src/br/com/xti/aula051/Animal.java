package br.com.xti.aula051;

public abstract class Animal {

	private double peso;
	private String comida;
	
	// m�todo construtor
	/*
	* Classes Abstratas tamb�m podem ter m�todos construtores,
	* por�m, n�o podem ser usados para instanciar um objeto diretamente
	* 	*/
	
	public Animal(double peso, String comida){
		this.comida = comida;
		this.peso = peso;
	}
	
	//classe abstrata pode ter m�todos n�o abstratos
	public void dormir (){System.out.println("Dormiu!");}
	
	//metodo abstrato. 
	//As classes concretas que herdam a classe abstrata sao obrigadas a implementar o metodo
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
