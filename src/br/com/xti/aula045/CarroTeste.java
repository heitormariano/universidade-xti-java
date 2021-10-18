package br.com.xti.aula045;

public class CarroTeste {

	public static void main(String[] args) {

		Carro ferrari = new Carro();

		ferrari.setModelo("Ferrari Enzo");
		ferrari.setVelocidadeMaxima(349);
		ferrari.setSegundosZeroACem(3.2);

		Motor v12 = new Motor();
		v12.setTipo("V12");
		v12.setPotencia(660);
		ferrari.setMotor(v12);

		Carro fusca = new Carro("Fusca", 100, 7.2);
		Motor v00 = new Motor("V00", 200);
		fusca.setMotor(v00);

		Motor vvt_i = new Motor("vvt-i", 350);
		Carro corolla = new Carro("Corolla", 350, 4.1, vvt_i);
		// Carro corolla = new Carro("Corolla",350,4.1, new Motor("vvt-i", 350));

		System.out.println("Carro 1:");
		System.out.println("Modelo: " + ferrari.getModelo());
		System.out.println("velocidade: " + ferrari.getVelocidadeMaxima());
		System.out.println("segundos zero a cem: " + ferrari.getSegundosZeroACem());
		System.out.println("motor: " + ferrari.getMotor().getTipo());

		System.out.println("Carro 2:");
		System.out.println("Modelo: " + fusca.getModelo());
		System.out.println("velocidade: " + fusca.getVelocidadeMaxima());
		System.out.println("segundos zero a cem: " + fusca.getSegundosZeroACem());
		System.out.println("motor: " + fusca.getMotor().getTipo());

		System.out.println("Carro 3:");
		System.out.println("Modelo: " + corolla.getModelo());
		System.out.println("velocidade: " + corolla.getVelocidadeMaxima());
		System.out.println("segundos zero a cem: " + corolla.getSegundosZeroACem());
		System.out.println("motor: " + corolla.getMotor().getTipo());

	}
}
