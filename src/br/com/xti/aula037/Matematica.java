package br.com.xti.aula037;

public class Matematica {

	/**
	 * 
	 * @param primeiroNum primeiro numero fornecido
	 * @param segundoNum  segundo numero fornecido
	 * @return o maior dos dois numeros
	 */
	public int maior(int primeiroNum, int segundoNum) {
		if (primeiroNum > segundoNum) {
			return primeiroNum;
		} else {
			return segundoNum;
		}
	}

	public int raiz(int numero) {
		// uma forma
		// return (int) Math.sqrt(numero);

		// outra forma (meu codigo)
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

	public String romanos(int numero) {
		return null;
	}

	public double soma(double um, double dois) {
		double soma = um + dois;
		return soma;
	}
}
