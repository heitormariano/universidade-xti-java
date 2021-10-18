package br.com.xti.aula038;

public class RaizPellAula {

	/** 
	 * @param numero numero para extrair a raiz
	 * @return a raiz quadrada segundo a equacao de Pell
	 * 
	 */
	public int raiz(int numero) {
		int raiz = 0, impar = 1;

		while (numero >= impar) {
			numero -= impar;

			impar += 2; // proximo numero impar
			++raiz;
		}

		return raiz;
	}
}
