package br.com.xti.aula037;

public class Matematica {

	/**
	 * 
	 * @param um
	 *            primeiro numero fornecido
	 * @param dois
	 *            segundo numero fornecido
	 * @return o maior dos dois numeros
	 */
	public int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
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
