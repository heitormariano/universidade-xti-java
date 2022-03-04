package br.com.xti.aula034;

public class CachorroTeste {

	public static void main(String[] args) {

		Cachorro viraLata = new Cachorro();

		viraLata.setRaca("vira lata");
		viraLata.setTamanho(1.45);

		Cachorro pastorAlemao = new Cachorro();

		pastorAlemao.setRaca("pastor alemao");
		pastorAlemao.setTamanho(1.55);

		System.out.println("Cachorros");
		System.out.println("Cachorro 1:");
		System.out.println("Raca: " + viraLata.getRaca());
		System.out.println("Tamanho: " + viraLata.getTamanho());
		System.out.print("Hora de latir: ");
		viraLata.latir();

		System.out.println("Cachorro 2:");
		System.out.println("raca: " + pastorAlemao.getRaca());
		System.out.println("tamanho: " + pastorAlemao.getTamanho());
		System.out.print("Hora de latir: ");
		pastorAlemao.latir();
	}
}
