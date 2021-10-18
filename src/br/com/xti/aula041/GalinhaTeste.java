package br.com.xti.aula041;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha galinha1 = new Galinha();
		
		/*galinha1.botar();
		galinha1.botar();
		galinha1.botar();*/
		
		galinha1.botar().botar().botar(); // maneira para chamar o metodo botar varias vezes

		System.out.println("Qtd ovos colocados pela galinha1: " + galinha1.ovos);

		Galinha galinha2 = new Galinha();

		galinha2.botar().botar().botar().botar().botar();

		System.out.println("Qtd ovos colocados pela galinha2: " + galinha2.ovos);

		System.out.println("Ovos da granja: " + Galinha.ovosDaGranja);

		System.out.println("Media de ovos: " + Galinha.mediaDeOvos(2));
	}
}
