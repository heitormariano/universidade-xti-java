package br.com.xti.aula044;

public class Carro {

	private String modelo;
	private int velocidadeMaxima;
	private double segundosZeroACem;

	public Carro() {

	}

	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getSegundosZeroACem() {
		return segundosZeroACem;
	}

	public void setSegundosZeroACem(double segundosZeroACem) {
		this.segundosZeroACem = segundosZeroACem;
	}
}
