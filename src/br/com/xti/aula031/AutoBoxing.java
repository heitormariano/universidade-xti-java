package br.com.xti.aula031;

public class AutoBoxing {

	public static void main (String[] args){
	
		//explicacao inicial
		//maneira que deveria ser feita com versões anteriores ao java 5
		Integer num = new Integer(234); //empacotado
		int x = num.intValue(); //desempacotar
		x++; //incrementando a variavel
		
		num = new Integer(x); //reempacotar
		System.out.println(num.intValue());
		
		
		//maneira possível atualmente com classes Wrapper (a partir do java 5)
		
		Integer num2 = 456;
		num2++; //desempacota, incrementa, reempacota
		
		System.out.println(num2);
		
		
		Boolean verdadeiro = new Boolean("true");
		
		//pode ser usada a classe Wrapper diretamente, sem precisa extrair o valor booleano.
		if(verdadeiro){
			System.out.println(verdadeiro);
		}
		
	}
}
