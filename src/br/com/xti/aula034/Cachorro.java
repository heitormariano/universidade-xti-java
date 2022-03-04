package br.com.xti.aula034;

public class Cachorro {

	private double tamanho;
	private String raca;

	public void latir() {
		System.out.println("au, au, au!");
	}

	public String getRaca() {
		return raca;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

}
