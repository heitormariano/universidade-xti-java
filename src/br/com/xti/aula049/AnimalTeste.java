package br.com.xti.aula049;

//subclasse herda os métodos e atributos da classe pai (superclasse)
public class AnimalTeste {

	//precisamos criar um metodo estatico para ele poder ser usado no main, pois tambem eh um metodo estatico
	public static void somAnimal (Animal animal){
		animal.fazerBarulho();
	}
	
	//caso nao fosse usado polimorfismo, o controle de qual som usar ficaria mais dificil. 
	//Imaginemos 100 animais para serem verificados. A complexidade seria muito maior
	
	//Um possível método:
	public static void somAnimalSemPolimorfismo (String animal){
		if (animal.equals("Cachorro")){
			System.out.println("Au, Au!");
		} else if (animal.equals("Galinha")){
			System.out.println("Co, Co!");
		}
	}
	
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
		
		Animal generico = new Animal(0, null);
		
		generico.fazerBarulho();
		
		//testando o metodo fazerbarulho() das classes Cachorro e Galinha
		toto.fazerBarulho();
		cocorico.fazerBarulho();
		
		//uso do metodo estatico somAnimal
		//vantagem do uso de polimorfismo.
		somAnimal(toto);
		somAnimal(cocorico);
		
		//uso do método estático somAnimalSemPolimorfismo 
		//somAnimalSemPolimorfismo("Cachorro");
		//somAnimalSemPolimorfismo("Galinha");
		
	}
}
