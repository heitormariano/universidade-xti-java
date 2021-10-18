package br.com.xti.aula048;

//subclasse herda os métodos e atributos da classe pai (superclasse)
public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		toto.setComida("carne");
		toto.dormir();
	
		
		Galinha cocorico = new Galinha();
		cocorico.dormir();
		
		System.out.println("toto eh um animal?");
		System.out.println(toto instanceof Animal);
		
		System.out.println("toto eh um Cachorro?");
		System.out.println(toto instanceof Cachorro);
		
		
		System.out.println("cocorico eh um Animal?");
		System.out.println(cocorico instanceof Animal);
		
		System.out.println("cocorico eh um Galinha?");
		System.out.println(cocorico instanceof Galinha);
		
		//todas as classes herdam da classe Object
		
		//exemplos de metodos herdados pela classe Object
		
		System.out.println("toto.equals(cocorico) : " + toto.equals(cocorico));
		System.out.println("toto.hashCode() : " + toto.hashCode());
		System.out.println("toto.getClass() : " + toto.getClass());
		System.out.println("toto.toString() : " + toto.toString());
	}
}
