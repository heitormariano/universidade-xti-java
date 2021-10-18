package br.com.xti.aula082;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener {

	JComboBox<String> comboBox;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("Fotos/Estrelas_01.jpg")),
			new ImageIcon(getClass().getResource("Fotos/Estrelas_02.jpg")),
			new ImageIcon(getClass().getResource("Fotos/Estrelas_03.jpg")),
			new ImageIcon(getClass().getResource("Fotos/Estrelas_04.jpg"))
	};
	
	public ControleCombo(){
		super("Album de Fotos");
		
		comboBox = new JComboBox<String>();
		comboBox.addItem("Estrela em destaque");
		comboBox.addItem("Muitas Estrelas");
		comboBox.addItem("Estrelas e cometa");
		comboBox.addItem("Formacao Estrela");
		
		comboBox.setFont(new Font("serif", Font.PLAIN, 26));
		comboBox.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, comboBox);
		c.add(BorderLayout.CENTER, label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,530);
		
		//continuar a aula quando possível
	}
	
	public static void main(String[] args) {
		new ControleCombo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			label.setIcon(imagens[comboBox.getSelectedIndex()]);
		}
	}
}
