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

public class Serializa {

	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException {
		String[] nomes = {"Keyth", "eu","amo","vc"};
		
		
		Path path = Paths.get("H:/eclipse/workspace/XTI-Parte2/src/aula067/arquivo/objeto.ser");
		
		if(!Files.exists(path.getParent())){
			Files.createDirectories(path.getParent());
		}
		
		/*Escrita de Objeto*/
		FileOutputStream fos = new FileOutputStream(path.toString());
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(nomes);
		oos.close();
		
		/*Leitura de Objeto*/
		
		FileInputStream fis = new FileInputStream(path.toString());
		ObjectInputStream ois = new ObjectInputStream(fis);
		String[] nomesRetornados = (String[]) ois.readObject();
		ois.close();
		System.out.println(Arrays.toString(nomesRetornados));	
	}
}
