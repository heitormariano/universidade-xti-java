package br.com.xti.aula064;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class Arquivo3 {

	public static void main(String[] args) {

		ArrayList<Conta> contas = new ArrayList<>();

		contas.add(new Conta("Heitor", 500.30));
		contas.add(new Conta("Keyth",1200.40 ));
		contas.add(new Conta("Andre", 600.00));
		contas.add(new Conta("Fabiana", 450.20));
		contas.add(new Conta("Carlos", 300.00));

		//escrita
		objetToText(contas);
		
		//Leitura
		ArrayList<Conta> contasImprimir = textToObject();
		System.out.println("Dados recuperados do arquivo contas.txt");
		
		for (int i = 0; i < contasImprimir.size(); i++) {
			
			System.out.println("Nome Cliente: "+ contasImprimir.get(i).getCliente());
			System.out.println("Saldo: "+ contasImprimir.get(i).getSaldo());
		}

	}

	private static void objetToText(ArrayList<Conta> contas){

		Path path = Paths.get("D:/Heitor/Documents/Univ. XTI/Java(projetos eclipse)/XTI-Parte2/src/aula064/arquivo/contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;


		try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path,utf8)){			

			Files.createDirectories(path.getParent());

			for (Conta conta: contas) {
				bufferedWriter.write(conta.getCliente());
				bufferedWriter.write("-");
				bufferedWriter.write(Double.toString(conta.getSaldo()));
				bufferedWriter.write("\n");

			}			
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
	private static ArrayList<Conta> textToObject(){

		ArrayList<Conta> contas = new ArrayList<>();
		
		Path path = Paths.get("D:/Heitor/Documents/Univ. XTI/Java(projetos eclipse)/XTI-Parte2/src/aula064/arquivo/contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		try (BufferedReader bufferedReader = Files.newBufferedReader(path, utf8)) {

			// o arquivo jah foi criado no metodo anterior
			//Files.createDirectories(path.getParent());
			String linha = null;
			while ((linha = bufferedReader.readLine()) != null){
				//na minha logica eu separo o nome do cliente e seu saldo pelo caractere "-"
				String[] dadosConta = linha.split("-");
				
				//tamanho da String precisa ser 2. indice 0 eh o nome do cliente.
				//O indice 1 eh o seu saldo
				if(dadosConta.length == 2){
					Conta conta = new Conta();
					
					conta.setCliente(dadosConta[0]);
					conta.setSaldo(Double.parseDouble(dadosConta[1]));
					
					contas.add(conta);
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return contas;
	}
}
