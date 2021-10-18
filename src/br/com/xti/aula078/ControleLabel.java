package br.com.xti.aula078;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {
	
	public ControleLabel(){
		//eh chamado o construtor da classe JFrame, repassando o nome da janela
		super("ControleLabel");
		
		//criando o label
		JLabel simples = new JLabel("label simples");
		
		//texto que aparece quando colocamos o mouse em cima
		simples.setToolTipText("Meu TooltTip");
		
		/*definir a fonte do label. 
		 * É definido a família, negrito e itálico (a barra é para separar os estilos. Não é um "ou" lógico), 
		 * tamanho 28 para a fonte*/
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
		
		JLabel label = new JLabel("label");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
		
		
		/*recuperar imagens no mesmo diretorio da classe ou 
		  proximos a ela (pensar em caminhos relativos, tendo como base 
		  a localizacao da classe)*/
		
		
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/lampada_v2.jpg"));
	
		JLabel labelComImg = new JLabel(icon);
		
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		container.add(simples);
		container.add(label);
		container.add(labelComImg);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
	
		new ControleLabel();
	}
}
