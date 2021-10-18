package br.com.xti.aula066;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo5 {

	public static void main(String[] args){
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();

		for (Path path : dirs) {
			System.out.println(path);
		}

		/*Listar conteúdo de um diretório*/
		Path path = Paths.get("H:/eclipse/workspace/XTI-Parte2/src/aula066/arquivo/mover/arquivo.txt");
		try {
			Files.createDirectories(path.getParent());
			
			if(!Files.exists(path)){
				Files.createFile(path);
				Files.write(path, "Texto: Teste, Teste.".getBytes());
			}
			
			//essa parte do códgo poderia estar no try assim: try(DirectoryStream<Path> streams = Files.newDirectoryStream(path)).
			DirectoryStream<Path> streams = Files.newDirectoryStream(path.getParent());
			for (Path conteudo : streams) {
				System.out.println("Arquivos(s) do diretorio " + path.getParent() + " :");
				System.out.println(conteudo.getFileName());
			}
			
			System.out.println("\n");
			
			//listar partições
			FileSystem fs = FileSystems.getDefault();
			Iterable<FileStore> fileStores = fs.getFileStores();
			
			for (FileStore fileStore : fileStores) {
				System.out.println("Unidade:" + fileStore.toString());
				System.out.println("Total de espaco:" + fileStore.getTotalSpace());
				System.out.println("Total disponivel:" + fileStore.getUsableSpace());
				System.out.println("Total utilizado:" +  (fileStore.getTotalSpace() - fileStore.getUsableSpace()));
				System.out.println("\n");
				
			}
			
		} catch (IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}
		
	}
}
