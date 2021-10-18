package br.com.xti.aula083;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener{

	JTextArea texto;
	
	public ControleTextArea(){
		super("Editor de Textos");

		texto = new JTextArea();
		texto.setFont(new Font("Serif", Font.PLAIN, 26));

		JScrollPane scroll = new JScrollPane(texto);

		JButton botao = new JButton("Abrir Arquivo");
		botao.setFont(new Font("Serif", Font.PLAIN, 26));
		botao.addActionListener(this);

		Container c = getContentPane();
		c.add(BorderLayout.CENTER,scroll);
		c.add(BorderLayout.SOUTH, botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleTextArea();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		
		/*
		 * com this informamos que a Janela (JFrame) é responsável por chamar a interface de escolha de arquivos.
		 */
		
		chooser.showOpenDialog(this);
		File file = chooser.getSelectedFile();
		
		try {
			
			Path path = Paths.get(file.getAbsolutePath());
			String retorno = new String(Files.readAllBytes(path));
			texto.setText(retorno);
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(this, "Arquivo nao pode ser carregado");
			//erro.printStackTrace();
		}
		
	}
}
