package br.com.xti.aula050;

//Os métodos abstratos só podem existir em uma classe abstrata
//Uma classe abstrata é um tipo de classe que não pode ser instanciada
//Herança entre classes abstratas: Uma classe abstrata não precisa implementar os 
//métodos abstratos da sua superclasse abstrata

public abstract class Animal {

	private double peso;
	private String comida;
	
	// método construtor
	/*
	* Classes Abstratas podem ter métodos construtores,
	* mas não podem ser usados para instanciar um objeto diretamente
	* 	*/
	
	public Animal(double peso, String comida){
		this.comida = comida;
		this.peso = peso;
	}
	
	//classe abstrata pode ter métodos não abstratos
	public void dormir (){System.out.println("Dormiu!");}
	
	//metodo abstrato. 
	//As classes concretas que herdam a classe abstrata sao obrigados a implementar(sobrescrever) o método
	public abstract void fazerBarulho ();
	
	//classe abstrata pode ter métodos não abstratos
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
