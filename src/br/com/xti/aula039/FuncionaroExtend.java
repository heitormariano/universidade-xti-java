package br.com.xti.aula039;

public class FuncionaroExtend extends Funcionario {

	public static void main(String[] args) {
		FuncionaroExtend f2 = new FuncionaroExtend();

		f2.nome = "Joao Beleza Camarada";
		f2.pakageNaParada = "package rapaz";
		f2.protectedNaParada = "protected show de bola";

		System.out.println(f2.nome);
		System.out.println(f2.pakageNaParada);
		System.out.println(f2.protectedNaParada);
	}
}
