package br.com.xti.aula049;

public class Galinha extends Animal {

	public Galinha() {
		super(2, "milho");
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Co, Co!");
	}

}
