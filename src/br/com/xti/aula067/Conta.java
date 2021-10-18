package br.com.xti.aula067;

import java.io.Serializable;

public class Conta implements Serializable{

	//obs.: s�o serializados vari�veis do objeto. Agora as vari�veis de 
	//classe (est�ticas) n�o s�o serializadas, pois n�o pertencem ao objeto, mas a classe. 
	//Ex.: private static int x = 0;
	private String cliente;
	//como n�o serializar uma vari�vel de objeto? Incluir modificador transient
	//transient private double saldo;
	private double saldo;
	
	public Conta(){	}
	public Conta(String cliente, double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String getCliente() {
		return cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void exibirSaldo(){
		System.out.println( this.cliente + ", seu Saldo eh: " + this.saldo);
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
		//this.saldo = this.saldo - valor;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void transferirPara(Conta destino, double valor){
		this.sacar(valor);
		destino.depositar(valor);
	}
}
