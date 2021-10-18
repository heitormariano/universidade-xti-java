package br.com.xti.aula074;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela(){
		//chamando metodo construtor da classe JFrame
		super("Minha Janela");
		
		//recuperar o Container da Janela [JFrame]
		//Container container = frame.getContentPane();
		JButton botao = new JButton("Clique");
		
		getContentPane().add(botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		new Janela();
	}
}
