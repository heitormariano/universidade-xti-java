package br.com.xti.aula069;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {

		/*quantidade de milisegundos desde 1970*/

		System.out.println(System.currentTimeMillis());

		/*Data atual*/
		Date agora = new Date();
		System.out.println(agora);

		/*data referente a*/
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data);

		/* Métodos */
		System.out.println(data.getTime());
		data.setTime(1_000_000_500_000L);
		System.out.println("nova data:" + data);

		/*data menor é retornado -1. data igual é retornado 0. data maior é retornado 1*/
		System.out.println(data.compareTo(agora));

		/*para trabalhar (manipular) com datas é preciso usar a classe Calendar*/
		
		//GregorianCalendar
		Calendar calendar = Calendar.getInstance();
		calendar.set(2012, calendar.JULY, 11);
		System.out.println(calendar.getTime());

		//ano
		System.out.println(calendar.get(Calendar.YEAR));
		// Mês é contado a partir de 0 (janeiro). Dezembro, por sua vez, é 11.
		System.out.println(calendar.get(Calendar.MONTH)); 
		//dia do ano
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		//dia do mês
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		//dia da semana
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); //conta a partir de domingo[dia 1]

		//definindo a data diretamente.
		//alterar o ano, mês e dia
		calendar.set(Calendar.YEAR, 2009);
		calendar.set(calendar.MONTH, Calendar.SEPTEMBER);
		calendar.set(Calendar.DAY_OF_MONTH, 27);

		//imprimir nova data
		System.out.println("Nova Data:" + calendar.getTime());

		//Limpando campos da data
		System.out.println("Data com campos de minuto e segundo apagados:");
		calendar.clear(Calendar.MINUTE);
		calendar.clear(Calendar.SECOND);
		System.out.println(calendar.getTime());

		//Adicionar ou remover unidades de tempo
		calendar.add(Calendar.DAY_OF_MONTH, 1); //aumentar o dia do mês em um unidade
		calendar.add(Calendar.YEAR, 1); //aumentar o ano em um unidade
		System.out.println(calendar.getTime());

		//aumentar ou dominuir, mas sem sair da unidade superior de tempo
		
		System.out.println("Data Atual:");
		System.out.println(calendar.getTime());
		//uso do método roll()
		calendar.roll(Calendar.DAY_OF_MONTH,20);//não sai do mês de referência
		System.out.println("Acrescido do dia com metodo roll()");
		System.out.println(calendar.getTime());
		
		/*Exemplo simples:*/
		
		/*Saudação com Bom Dia, Boa Tarde ou Boa Noite*/
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Pequena Aplicacao Exemplo");
		
		System.out.println("Hora retornada (neste momento):" + hora);
		
		if(hora <= 12){
			System.out.println("Bom Dia");
		}else if(hora > 12 && hora < 18){
			System.out.println("Boa Tarde");
		}else {
			System.out.println("Boa Noite");
		}
		
	}
}
