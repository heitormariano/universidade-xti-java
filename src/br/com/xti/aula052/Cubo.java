package br.com.xti.aula052;

public class Cubo implements VolumeCalculavel, AreaCalculavel {

	private double lado;
	
	public Cubo(double lado){
		this.lado = lado;
	}
	@Override
	public double calcularVolume() {
		return 6 * Math.pow(lado, 2);
		//return 6 * lado * lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 3);
		//return lado * lado * lado;
	}

	
}
