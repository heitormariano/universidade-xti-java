package br.com.xti.aula045;

public class Carro {

	private String modelo;
	private int velocidadeMaxima;
	private double segundosZeroACem;
	private Motor motor;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem){
		//this(); //chama o construtor sem parametros
		
		this(modelo,velocidadeMaxima,segundosZeroACem, null); //chama o construtor mais completo.
		
		/*this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;*/
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
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
	
	public Motor getMotor(){
		return motor;
	}
	
	public void setMotor (Motor motor){
		this.motor = motor;
	}
}

