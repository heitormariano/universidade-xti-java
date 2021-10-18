package br.com.xti.aula039.pacote.externo;

import br.com.xti.aula039.Funcionario;

public class FuncionarioExterno {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();

		f.nome = "Blzation";

		System.out.println("Nome: " + f.getNome());
	}
}
