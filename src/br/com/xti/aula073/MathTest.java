package br.com.xti.aula073;

public class MathTest {

	public static void main(String[] args) {

		System.out.println("Constante de Euler:" + Math.E);
		System.out.println("Constante PI:" + Math.PI);

		//seno
		System.out.println(Math.sin(10));

		//cosseno
		System.out.println(Math.cos(10));

		//tangente
		System.out.println(Math.tan(45));

		//potência
		System.out.println(Math.pow(4, 2)); 
		System.out.println(Math.pow(3, 4));
		System.out.println(Math.pow(2, 3));

		//raiz quadrada de um número
		System.out.println(Math.sqrt(36));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.sqrt(49));
		//raiz cúbica de um número
		System.out.println(Math.cbrt(27));
		System.out.println(Math.cbrt(8));
		System.out.println(Math.cbrt(16));
		
		//hipotenusa
		System.out.println(Math.hypot(2, 4));
		
		//maior número
		System.out.println("Maior: " + Math.max(4, 8));
		System.out.println("Maior: " + Math.max(9, 2));
		
		//menor número
		System.out.println("Menor: " + Math.min(5, 7));
		System.out.println("Menor: " + Math.min(3, 1));
		
		


	}
}
