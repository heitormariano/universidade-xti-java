package br.com.xti.aula029;

public class FibonacciAula {

	public static void main(String[] args) {
		
		int anterior  = 0;
		int proximo = 1;
		
		//novo numero da serie de fibonacci
		
		System.out.println("Fibonacci:");
		
		System.out.println(anterior);
		
		while (proximo < 50){
			
			System.out.println(proximo);
			
			proximo = proximo + anterior; // proximo numero fibonacci
			anterior = proximo - anterior;	// atualizando o numero anterior (soma - numero anterior)
		}
		
	}
}
