package br.com.xti.aula039;


public class Funcionario {

	//variavel acessada apenas pela classe.
	//private String nome;
	
	//protected  = os membros desse tipo sao acessados pela classe, pacote e subclasses 
	
	//Nao indicando o modificador de acesso da variavel no 
	//código, o padrao eh sempre package (os membros sao acessados na classe ou pacote)
	
	//String nome;
	
	// variavel acessada por todos os elementos
	public String nome;
	
	//variaveis do tipo package e protected
	String pakageNaParada;
	protected String protectedNaParada;
	
	public static void main(String[] args) {

		Funcionario f = new Funcionario();

		// variaveis do tipo private sao acessadas apenas na classe
		f.nome = "Belezinha Massa da Silva";
	}

	public String getNome() {
		return this.nome;
	}
}
