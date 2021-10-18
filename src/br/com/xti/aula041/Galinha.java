package br.com.xti.aula041;

public class Galinha {

	public static int ovosDaGranja; //variavel global, ou seja, eh criada apenas uma vez. Variavel pertence a classe e nao ao objeto
	
	public int ovos; //total de ovos do objeto galinha. Toda vez que eh criado um objeto galinha, uma variavel ovos eh criada também
	
	/*public void botar(){
		ovos ++;
	}*/
	
	public Galinha botar(){
		ovos ++;
		Galinha.ovosDaGranja ++;
		return this; // retornando o objeto Galinha.
	}
	
	public static double mediaDeOvos (int qtdGalinhas){
		
		return Galinha.ovosDaGranja/qtdGalinhas;
		
		//pode ser feito assim tambem:
		//return ovosDaGranja/qtdGalinhas;
		//eh possivel acessar dentro de um metodo estatico as variaveis estaticas, sem precisar especificar o nome da classe
	}
}
