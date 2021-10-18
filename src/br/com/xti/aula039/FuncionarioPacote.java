package br.com.xti.aula039;

public class FuncionarioPacote {

	public static void main(String[] args) {
		// a variavel private nao pode ser acessada aqui.

		Funcionario f = new Funcionario();
		f.nome = "Massa Bezerra";
		f.protectedNaParada = "Funciona Mesmo. Protected na parada";

		System.out.println("Nome: " + f.getNome());
		System.out.println("Protected: " + f.protectedNaParada);

	}
}
