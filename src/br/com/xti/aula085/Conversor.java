package br.com.xti.aula085;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField textResultado;
	private JTextField textValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					double fahrenheit = Double.parseDouble(textValor.getText());
					double celsius = (fahrenheit - 32) / 1.8;
					textResultado.setText(celsius + " C"); // não consegui colocar o símbolo corretamente.
				}catch(Exception erro){	}

			}
		});
		
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(btnConverter, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));

		JLabel lblNewLabel = new JLabel("fahrenheit");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblNewLabel);

		textValor = new JTextField();
		textValor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(textValor);
		textValor.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("celsius");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblNewLabel_1);

		textResultado = new JTextField();
		textResultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(textResultado);
		textResultado.setColumns(10);
	}

}
