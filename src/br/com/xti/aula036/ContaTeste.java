package br.com.xti.aula036;

public class ContaTeste {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setCliente("Fulano da Silva");
		conta.setSaldo(150.00);

		System.out.println("Saldo inicial:");
		conta.exibirSaldo();

		conta.sacar(100.00);
		System.out.println("Saldo depois do saque:");

		conta.exibirSaldo();

		System.out.println("Vamos fazer um deposito. Mais dinheiro!");

		conta.depositar(350.00);

		System.out.println("Saldo depois do deposito:");
		conta.exibirSaldo();
		
		// criando uma conta de destino para realizar uma tranferencia
		
		Conta destino = new Conta();
		destino.setCliente("Camarada Legal");
		destino.setSaldo(650.00);

		conta.transferirPara(destino, 200.00);

		System.out.println("Saldo atual da conta depois da tranferencia:");
		conta.exibirSaldo();

		System.out.println("Saldo atual da conta de destino depois da tranferencia");
		destino.exibirSaldo();
	}

}
