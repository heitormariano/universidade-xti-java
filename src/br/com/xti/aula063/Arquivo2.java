package br.com.xti.aula063;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {
		String absolutePath = "D:/Heitor/Documents/Univ. XTI/Java(projetos eclipse)/XTI-Parte2/src/aula063/arquivo/arquivo2.txt";
		Path path = Paths.get(absolutePath);
		Charset utf8 = StandardCharsets.UTF_8;

		// streams -> sequencias ordenadas de dados (possuem uma origem ou um
		// destino)

		/* Escrita */
		BufferedWriter bufferedWriter = null;

		try {
			// acrescentei esta linha
			Files.createDirectories(path.getParent());

			// criando um escritor
			// Buffer -> depósito de dados
			bufferedWriter = Files.newBufferedWriter(path, utf8);
			
			bufferedWriter.write("Heitor");
			bufferedWriter.write(" - ");
			bufferedWriter.write("Keyth\n");
			bufferedWriter.write("Carlyle");
			bufferedWriter.write(" - ");
			bufferedWriter.write("Lourdes\n");

			// grava o conteúdo do arquivo
			bufferedWriter.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
		
		BufferedReader bufferedReader = null;
		try{
			bufferedReader = Files.newBufferedReader(path,utf8);
			String line = null;
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
