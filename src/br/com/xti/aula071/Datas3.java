package br.com.xti.aula071;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {


	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2012, Calendar.JULY, 29);
		Date date =  c.getTime();
		
		//saber localização padrão
		Locale padrao = Locale.getDefault();
		
		/*supondo que não estivéssemos no Brasil. Na construção do objeto é 
		  passado a linguagem e o país
		  */
		
		Locale brasil = new Locale("pt","BR");

		//outras localizações
		Locale india = new Locale("hi", "IN");
		
		Locale usa = Locale.US;
		
		Locale china = Locale.CHINA;
		
		Locale japao = Locale.JAPAN;
		
		Locale italia = Locale.ITALY;
		
		Locale frances = Locale.FRANCE;
		
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		//repassando objeto Locale na hora de objter a instancia de um DateFormat
		f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, china);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, japao);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, frances);
		System.out.println(f.format(date));
		
	}

}
