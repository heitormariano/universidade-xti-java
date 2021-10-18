package br.com.xti.aula079;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ControleTeste extends JFrame{

	JTextField login;
	JPasswordField senha;
	JButton ok, cancel;
	//protected static ControleTeste tela1;

	public ControleTeste(){
		super("Textos e Senhas");


		login = new JTextField();
		senha = new JPasswordField();

		ok = new JButton("OK");
		ok.addActionListener(new BotaoOkListener());

		cancel =  new JButton("Cancel");;
		cancel.addActionListener(new BotaoCancelListener());

		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 2));

		container.add(new JLabel("Login:"));
		container.add(login);
		container.add(new JLabel("Senha:"));
		container.add(senha);
		container.add(ok);
		container.add(cancel);

		setSize(260,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		//ControleTeste tela1 = new ControleTeste();
		//teste para definir a posicao da tela apos a execucao do codigo
		//new ControleTeste().setLocation(500,200);
		
		new ControleTeste();

	}


	//classe interna
	class BotaoOkListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			String s = "login:" + login.getText() + 
					"\nsenha:" + new String (senha.getPassword());

			JOptionPane.showMessageDialog(null, s);

			//teste para deixar a tela inicial não visível (tela1, no caso)
			/*tela1.setVisible(false);
			ControleTesteTela2 tela2 = new ControleTesteTela2();
			tela2.setVisible(true);*/
		}

	}

	//classe interna
	class BotaoCancelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			login.setText("");
			senha.setText("");
		}
	}
}
