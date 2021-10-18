
package br.com.xti.aula057;

//wathpoint -> usado para monitorar vari�veis de inst�ncias (vari�veis de objetos)
//exception breakpoint -> permite o monitoramento da ocorr�ncia de exce��es
//class Exception -> monitorar o carregamento (instancia��o/inicializa��o) de uma classe espec�fica

public class DebugExemplo {

	int resultado;
	
	public int raiz (int numero){
		int raiz = 0, impar = 1;
		
		while (numero >= impar){
			numero -= impar;
			impar +=2; // igual a impar = impar + 2;
			++raiz; // a raiz � o numero de ciclos, vezes que entramos no while
		}
		
		return raiz;
	}
	
	public static void main(String[] args) {
		int numero = 16;
		DebugExemplo exemplo = new DebugExemplo();
		int raiz = exemplo.raiz(numero);
		
		if(raiz == 4){
			System.out.println("Raiz correta");
		}
	}
}
