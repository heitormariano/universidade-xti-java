package br.com.xti.aula056;

import java.util.Scanner;

// as assertions ajudam o programador na fase de desenvolvimento. Elas, por padrao, estao desabilitadas.
// As assertions são usadas para verificar siituações que NUNCA devem acontecer.

//Caso seja preciso usar assertions, elas precisam ser ativadas. 
//Em Run Configurations definir "-ea" (enable assertions) em Arguments->VM arguments
public class Assertion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("informe um numero entre 0 e 10");
	
		int numero = s.nextInt();
		
		//assert(<validação/condição>: <mensagem de erro caso a condção não seja obedecida>
		//as Assertions devem ser usadas apenas durante a fase de desenvolvimento. 
		//O produto final deve ser entregue sem as assertions
		assert (numero >= 0 & numero <= 10) : "Numero invalido: " + numero;
		System.out.println("Numero:" + numero);
	}
}
