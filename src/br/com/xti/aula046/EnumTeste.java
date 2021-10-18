package br.com.xti.aula046;

public class EnumTeste {

	public static final double PI = 3.14;

	public static void andar(Medida medida, int total) {

		System.out.println("Total percorrido [usuario indica]: " + total + " " + medida.titulo + "s");
	}

	public static void main(String[] args) {

		System.out.println("Peca de xadrez: " + PecasXadrez.BISPO);

		System.out.println("Medida: " + Medida.M.titulo);

		// percorrer constantes de uma enumeracao

		for (Medida medida : Medida.values()) {
			System.out.println(medida + ": " + medida.titulo);
		}

		// percurso percorrido:

		andar(Medida.M, 100);

		for (PecasXadrez peca : PecasXadrez.values()) {
			System.out.println(peca);
		}
	}
}
