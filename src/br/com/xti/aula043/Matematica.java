package br.com.xti.aula043;

public class Matematica {

	/**
	 * 
	 * @param um primeiro numero fornecido
	 * @param dois segundo numero fornecido
	 * @return o maior dos dois numeros
	 */
	public int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}
	
	public int raiz (int numero){
		//uma forma
		//return (int) Math.sqrt(numero);
		
		//outra forma
		//meu codigo

		int ciclos = 0;
		int impar = 1;
		int resultado = numero;

		while (resultado >= impar) {
			resultado = resultado - impar;

			impar += 2;
			ciclos += 1;
		}

		return ciclos;
	}
	
	public String romanos (int numero){
		return null;
	}
	
	/*public double soma (double um, double dois){
		double soma =  um + dois;
		return soma;
	}*/
	
	//modificando o metodo soma para receber um numero indeterminado de argumentos
	
	public double soma (double ... numeros){
		double total = 0;
		
		for (double num : numeros) {
			total += num;
		}
		
		return total;
	}

	// o metodo de cima eh semelhante a este.
	public double somaArray(double[] numeros) {
		double total = 0;

		for (double num : numeros) {
			total += num;
		}
		return total;
	}

	
	public double soma(String titulo, double... numeros) {
		System.out.println(titulo);

		double total = 0;

		for (double num : numeros) {
			total += num;
		}
		return total;
	}
	
	public double media(int x, int y) {
		System.out.println("media (int x, int y)");
		return (x + y) / 2;
	}

	public double media(String x, String y) {
		System.out.println("media (String x, String y)");
		double num1 = Double.parseDouble(x);
		double num2 = Double.parseDouble(y);

		return (num1 + num2) / 2;
	}

	public double media(int x) {
		System.out.println("media (int x)");
		return x;
	}

	public double media(double... numeros) {
		System.out.println("media(double ... numeros)");

		return this.soma(numeros) / numeros.length;
	}
}
