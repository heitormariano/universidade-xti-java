package br.com.xti.aula075;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {

	public Layouts(){
		//inicializando a janela
		
		super("Layouts");
		
		Container container = getContentPane();
		
		/*BorderLayout border = new BorderLayout();
		BorderLayout é o layout padrão do JFrame */
		
		/*container.add(BorderLayout.NORTH, new JButton("1"));
		container.add(BorderLayout.SOUTH, new JButton("2"));*/
		
		/*Programador pode criar seu próprio BoderLayout*/
		/*BorderLayout border = new BorderLayout();
		container.setLayout(border);*/
		
		//defindo outro tipo de layout
		container.setLayout(new FlowLayout());
		
		container.add(new JButton("1"));
		container.add(new JButton("2"));
		container.add(new JButton("3"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Layouts();
	}
}
