package br.com.xti.aula024;

public class Fluxo {

	public static void main(String[] args) {
		// switch.
		char sexo = 'F';

		switch (sexo) {
		case 'M':
			System.out.println("Sexo Masculino");
			break;
		case 'F':
			System.out.println("Sexo Feminino");
			break;
		// default funciona como um else.
		default:
			System.out.println("Outro");
		}

		// outra forma de uso do switch
		Tecnologia tecnologia = Tecnologia.POSTGRESQL;

		switch (tecnologia) {
		case JAVA:
		case CPP:
		case COBOL:
			System.out.println("Linguagem de Programacao");
			break;
		case ORACLE:
		case POSTGRESQL:
		case SQLSERVER:
			System.out.println("Banco de Dados");
			break;
		default:
			System.out.println("Tecnologia desconhecida");
		}
	}
}
