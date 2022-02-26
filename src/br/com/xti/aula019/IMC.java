package br.com.xti.aula019;

import javax.swing.JOptionPane;

/**
 * Classe para calcular o IMC IMC = peso[Kg] / Altura [m] * altura [m]
 * 
 * @author Heitor
 *
 */
public class IMC {

	public static void main(String[] args) {

		String peso = JOptionPane.showInputDialog("Qual o seu peso em Quilogramas?");

		String altura = JOptionPane.showInputDialog("Qual a sua altura em metros?");

		double pesoKg = Double.parseDouble(peso);
		double alturaM = Double.parseDouble(altura);

		double imc = pesoKg / Math.pow(alturaM, 2);

		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do Peso Ideal";

		msg = "IMC: " + imc + "\n" + "Situacao: " + msg;

		JOptionPane.showMessageDialog(null, msg);

		/*
		 * System.out.println("IMC: " + imc); System.out.println("Situacao: " + msg);
		 */

	}

}
