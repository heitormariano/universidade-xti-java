package br.com.xti.aula049;

public class OperacaoTeste {

	
	public static void calcule(OperacaoMatematica operacao, double x, double y){
		System.out.println(operacao.calcular(x, y));
	}
	
	public static void calculeSemPolimorfismo(String operacao, double x, double y){
		//implementacao estruturada, nao segue uma implementacao orientada a objetos
		if (operacao.equals("Soma")){
			System.out.println(x + y);
		} else if (operacao.equals("Multiplicacao")){
			System.out.println(x * y);
		}
	}

	public static void main(String[] args) {
		//realizando um teste com a classe OperacaoMatematica
		OperacaoMatematica operacaoGenerica = new OperacaoMatematica();
		System.out.println(operacaoGenerica.calcular(10, 20));
		
		//usando o princípio de polimorfismo
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);
		
		//calculeSemPolimorfismo("Soma", 5, 5);
		//calculeSemPolimorfismo("Multiplicacao", 5, 5);
	}
}
