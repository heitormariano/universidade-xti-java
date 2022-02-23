package br.com.xti.aula055;

import java.util.Scanner;

public class TesteSenhaInvalida {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a senha para autenticacao:");
		String senha = scan.next();
		try {
			verificarSenha(senha);
		} catch (SenhaInvalidaException e) {
			e.printStackTrace();
		}
	}

	public static void verificarSenha(String senha) throws SenhaInvalidaException {

		if ("123".equals(senha)) {
			System.out.println("Senha valida. Tudo certo!");
		} else {
			throw new SenhaInvalidaException("Senha Invalida Informada");
		}
	}
}
