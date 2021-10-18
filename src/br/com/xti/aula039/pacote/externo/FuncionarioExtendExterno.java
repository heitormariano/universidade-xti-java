package br.com.xti.aula039.pacote.externo;

import br.com.xti.aula039.Funcionario;

public class FuncionarioExtendExterno extends Funcionario {

	public static void main(String[] args) {
		FuncionarioExtendExterno f3 = new FuncionarioExtendExterno();

		f3.nome = "Nome True";
		// variavel protected definida na classe Funcionario
		// pode ser acessada pelas subclasses
		f3.protectedNaParada = "Protected na Parada";

		System.out.println(f3.nome);
		System.out.println(f3.protectedNaParada);
	}
}
