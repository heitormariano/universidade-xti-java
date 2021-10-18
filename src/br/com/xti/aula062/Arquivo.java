package br.com.xti.aula062;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		//java 7
		String abosolutePath = "D:/Heitor/Documents/Univ. XTI/Java(projetos eclipse)/XTI-Parte2/src/aula062/arquivo/arquivo.txt";
		Path path = Paths.get(abosolutePath);
		
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		
		/*criação de diretórios*/
		Files.createDirectories(path.getParent());
		/*escrever e ler arquivos*/
		String fileContent = "Meu Texto, cara";
		byte[] bytes = fileContent.getBytes(); //getBytes() -> usado para manipular arquivos pequenos
		Files.write(path, bytes); // cria o arquivo, limpa e escreve o seu conteúdo.
		
		byte[] content = Files.readAllBytes(path);
		System.out.println(new String(content));
	}
}
