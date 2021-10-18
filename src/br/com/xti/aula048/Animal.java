package br.com.xti.aula048;

public class Animal {

	private double peso;
	private String comida;
	
	//com a definicao de tal construtor, o compilador nao reconhece mais o construtor sem parametros
	public Animal(double peso, String comida){
		this.comida = comida;
		this.peso = peso;
	}
	
	public void dormir (){System.out.println("Dormiu!");}
	public void fazerBarulho (){System.out.println("Fazer barulho!");}
	
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
