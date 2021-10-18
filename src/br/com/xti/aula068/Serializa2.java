package br.com.xti.aula068;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Serializa2 {

	Path path = Paths.get("H:/eclipse/workspace/XTI-Parte2/src/aula068/arquivo/contasAula.txt");
	Charset utf8 = StandardCharsets.UTF_8;
	
	public void armazenarContas(ArrayList<Conta> contas) throws IOException{
		
		if(!Files.exists(path.getParent())){
			Files.createDirectories(path.getParent());	
			//Files.createFile(path);
		}
		
		/*Quando é criado um BufferedWriter passando o path, 
		o arquivo que consta no caminho (contasAula.txt) é criado.*/
		
		try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path,utf8)) {
			for (Conta conta : contas) {
				bufferedWriter.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
				
			}
		} 
	}
	
	public ArrayList<Conta> recuperarContas() throws IOException{
		ArrayList<Conta> contas = new ArrayList<>();
		
		try(BufferedReader bufferedReader = Files.newBufferedReader(path, utf8)){
			String line = null;
			
			while((line = bufferedReader.readLine()) != null){
				String[] tokens = line.split(";");
				Conta conta = new Conta(tokens[0],Double.parseDouble(tokens[1]));
				contas.add(conta);
			}
		}
		
		return contas;
		
	}
	public static void main(String[] args) throws IOException {
		ArrayList<Conta> contas = new ArrayList<>();

		contas.add(new Conta("Heitor", 500.30));
		contas.add(new Conta("Keyth",1200.40 ));
		contas.add(new Conta("Andre", 600.00));
		contas.add(new Conta("Fabiana", 450.20));
		
		Serializa2 operacao = new Serializa2();
		operacao.armazenarContas(contas);
		
		
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		
		for (Conta conta : contas2) {
			conta.exibirSaldo();
		}
	}
}
