package br.com.xti.aula070;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {


	public static void main(String[] args) throws ParseException {
		//formatação de datas

		Calendar c = Calendar.getInstance();
		c.set(2010, Calendar.APRIL, 28);
		Date date =  c.getTime();
		System.out.println(date);

		/*Formatação de datas (dia, mês e ano)*/
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));

		/*Formatação das horas*/
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));

		/*Formatação de data e hora*/
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));

		/*Estilos*/

		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Estilo Full: " + f.format(date));

		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Estilo Long: " + f.format(date));

		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Estilo Medium: " + f.format(date));

		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Estilo Short: " + f.format(date));

		//converter String em data
		Date date2 = f.parse("15/06/2011");
		System.out.println("Uso do metodo parse():");
		System.out.println(date2);
		
		/*SimpleDateFormat*/
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Uso da classe SimpleDateFormat:");
		System.out.println(sdf.format(date2));
		System.out.println("Uso do metodo parse() do objeto SimpleDateFormat:");
		System.out.println(sdf.parse("10/12/2012"));
		
	}

}
