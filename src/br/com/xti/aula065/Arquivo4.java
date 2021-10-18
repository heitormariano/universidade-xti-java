package br.com.xti.aula065;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.Watchable;

public class Arquivo4 {
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("H:/eclipse/workspace/XTI-Parte2/src/aula065/arquivo/arquivo.txt");
		Charset utf8 = StandardCharsets.UTF_8;


		/*Criação de arquivos*/
		
		Files.deleteIfExists(path);
		Files.createFile(path);
		Files.write(path, "Meu texto".getBytes());

		/*Cópia de arquivos*/
		
		Path pathCopia = Paths.get("H:/eclipse/workspace/XTI-Parte2/src/aula065/arquivo/copia.txt");
		
		Files.copy(path, pathCopia, StandardCopyOption.REPLACE_EXISTING);
		
		/*mover arquivos*/
		
		Path pathMover = Paths.get("H:/eclipse/workspace/XTI-Parte2/src/aula065/arquivo/mover/fonte.txt");
		Files.createDirectories(pathMover.getParent());
		Files.move(path, pathMover, StandardCopyOption.REPLACE_EXISTING);
		
		
		/*if(!Files.exists(path)){
				//criando o caminho de diretórios 
				Files.createDirectories(path.getParent());
				//criando o arquivo no caminho de diretóriios 
				Files.createFile(path);
			}

			System.out.println(Files.exists(path));
			System.out.println(Files.exists(path.getParent()));
			System.out.println(Files.isDirectory(path));
			System.out.println(Files.isRegularFile(path));
			System.out.println(Files.isReadable(path));
			System.out.println(Files.isExecutable(path));
			System.out.println(Files.size(path));
			System.out.println(Files.getLastModifiedTime(path));
			System.out.println(Files.getOwner(path));
			System.out.println(Files.probeContentType(path));*/


		/*Exclusão*/
		//Files.delete(path);
		//Files.deleteIfExists(path);
	}
}
