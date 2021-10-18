
package br.com.xti.aula057;

//wathpoint -> usado para monitorar variáveis de instâncias (variáveis de objetos)
//exception breakpoint -> permite o monitoramento da ocorrência de exceções
//class Exception -> monitorar o carregamento (instanciação/inicialização) de uma classe específica

public class DebugExemplo {

	int resultado;
	
	public int raiz (int numero){
		int raiz = 0, impar = 1;
		
		while (numero >= impar){
			numero -= impar;
			impar +=2; // igual a impar = impar + 2;
			++raiz; // a raiz é o numero de ciclos, vezes que entramos no while
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
