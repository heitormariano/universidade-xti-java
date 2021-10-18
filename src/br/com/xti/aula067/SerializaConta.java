package br.com.xti.aula067;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class SerializaConta {

	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
		
		
		Path path = Paths.get("H:/eclipse/workspace/XTI-Parte2/src/aula067/arquivo/objetoConta.ser");
		
		Conta conta1 = new Conta("Heitor",123000.34);
		Conta conta2 = new Conta("Keyth", 245000.45);
		
		if(!Files.exists(path.getParent())){
			Files.createDirectories(path.getParent());
		}
		
		/*Escrita de Objeto*/
		FileOutputStream fos = new FileOutputStream(path.toString());
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
		
		/*Leitura de Objeto*/
		
		FileInputStream fis = new FileInputStream(path.toString());
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta contaRetornada = (Conta) ois.readObject();
		Conta contaRetornada2 = (Conta) ois.readObject();
		ois.close();
		
		//a informação de saldo aparecerá igual a 0 se o atributo saldo não 
		//for serializado, ou seja,se for usado o modificador transient no 
		//atributo saldo da classe Conta.
		contaRetornada.exibirSaldo();
		contaRetornada2.exibirSaldo();
		
		
	}
}
