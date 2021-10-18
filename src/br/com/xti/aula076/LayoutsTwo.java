package br.com.xti.aula076;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutsTwo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LayoutsTwo (){
		super("Layouts Two");


		/*container.setLayout(new BorderLayout(15, 15));
		container.add(BorderLayout.NORTH, new JButton("N"));
		container.add(BorderLayout.SOUTH, new JButton("S"));
		container.add(BorderLayout.CENTER, new JButton("C"));
		container.add(BorderLayout.EAST, new JButton("E"));
		container.add(BorderLayout.WEST, new JButton("W"));
		 */

		//2 -> indica as linhas do grid
		//3 -> indica o numero de colunas.
		/*container.setLayout(new GridLayout(2,3));
		container.add(new JButton("B1"));
		container.add(new JButton("B2"));
		container.add(new JButton("B3"));
		container.add(new JButton("B4"));
		container.add(new JButton("B5"));
		container.add(new JButton("B6"));*/


		//por padrao o Container possue o BorderLayout
		//o container abaixo eh o container principal
		Container container = getContentPane();

		/*o BorderLayout é o layout padrão. Dessa forma, a linha 
		pode ser tirada*/
		container.setLayout(new BorderLayout());

		//existem varios tpos de containers. O usado abaixo eh o JPanel
		Container container2 = new JPanel();

		//GridLyout (layout em grade) com 4 linhas e 1 coluna
		container2.setLayout(new GridLayout(4,1));
		container2.add(new JButton("OK"));
		container2.add(new JButton("CANCEL"));
		container2.add(new JButton("SETUP"));
		container2.add(new JButton("HELP"));

		container.add(BorderLayout.CENTER, new JButton("Centro"));
		container.add(BorderLayout.EAST, container2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LayoutsTwo();
	}
}
