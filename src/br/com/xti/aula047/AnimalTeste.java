package br.com.xti.aula047;

//subclasse herda os métodos e atributos da classe pai (superclasse)
public class AnimalTeste {

	public static void main(String[] args) {

		Cachorro toto = new Cachorro();
		toto.setComida("carne");
		toto.dormir();

		Galinha cocorico = new Galinha();
		cocorico.dormir();
	}
}
