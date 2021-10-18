package br.com.xti.aula077;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//a classe Eventos tambem eh uma janela (JFrame)
//a classe tambem sera responsavel por tratar os eventos (implementa ActionListener)
public class Eventos extends JFrame implements ActionListener{
	
	JButton botao;
	
	public Eventos(){
		super("Eventos");
		botao = new JButton("Clique Aqui!");
		
		
		//garantir que o botao sera capaz de reconhecer eventos
		botao.addActionListener(this);
		//adicionar ao container o botao.
		getContentPane().add(botao);
			
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		new Eventos();
	}

	//a interface "pede" para implementar o metodo actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		
		botao.setText("Foi Clicado!");
		
		//System.out.println("Clicou, cara!");
		
		//JOptionPane.showInputDialog("Teste");
	}
}
