package br.com.xti.aula072;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {
		double saldo = 123_456.789;
		NumberFormat nf = NumberFormat.getInstance(); //formatação genérica
		System.out.println(nf.format(saldo));
		
		/*Formata o número para deixá-lo como inteiro. Retira a parte fracionada do saldo*/
		nf = NumberFormat.getIntegerInstance();
		System.out.println(nf.format(saldo));
		
		/*formatação percetual*/
		nf = NumberFormat.getPercentInstance();
		System.out.println(nf.format(0.25));
		
		/*formatação moeda*/
		nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(saldo));
		
		/*definir número de casas decimais*/
		nf.setMaximumFractionDigits(1);
		System.out.println(nf.format(saldo));
		
		nf.setMaximumFractionDigits(3);
		System.out.println(nf.format(saldo));
		
		/*Internacionalização - Moeda*/
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf.format(saldo));
		
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(nf.format(saldo));
		
		/*Conversão de valores*/
		nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.parse("R$ 120.456,80"));
		
		/*Number num = nf.parse("R$ 1.200,34");
		double valorConvertido = num.doubleValue();
		System.out.println(valorConvertido);*/
	}
}
