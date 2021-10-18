package br.com.xti.aula044;

public class CarroTeste {

	public static void main(String[] args) {

		Carro ferrari = new Carro();

		ferrari.setModelo("Ferrari Enzo");
		ferrari.setVelocidadeMaxima(349);
		ferrari.setSegundosZeroACem(3.2);

		Carro fusca = new Carro("Fusca", 100, 7.2);

		System.out.println("Carro 1:");
		System.out.println("Modelo: " + ferrari.getModelo());
		System.out.println("velocidade: " + ferrari.getVelocidadeMaxima());
		System.out.println("segundos zero a cem: " + ferrari.getSegundosZeroACem());

		System.out.println("Carro 2:");
		System.out.println("Modelo: " + fusca.getModelo());
		System.out.println("velocidade: " + fusca.getVelocidadeMaxima());
		System.out.println("segundos zero a cem: " + fusca.getSegundosZeroACem());
	}
}
