package br.com.xti.aula054;

public class ExcecoesComuns {

	static int[] arrayNull; //array que não foi inicializado
	static int[] arraySimples = new int[2];//criando array de tamanho 2 (pode guardar 2 elementos)

	public static void main(String[] args) {
		//NullPointerException
		//System.out.println(arrayNull.length);
		
		//ArithmeticException
		//int x = 10/0;
		//System.out.println(x);
		
		//ArrayIndexOutOfBoundsException
		//System.out.println(arraySimples[2]);
		
		//ClassCastException
		//Animal galinha = new Galinha();
		//Cachorro cachorro = (Cachorro)galinha;
		
		//NumberFormatException
		//double numero = Double.parseDouble("Show");
	}
}
