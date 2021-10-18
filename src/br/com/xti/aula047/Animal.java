package br.com.xti.aula047;

public class Animal {

	private double peso;
	private String comida;
	
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
