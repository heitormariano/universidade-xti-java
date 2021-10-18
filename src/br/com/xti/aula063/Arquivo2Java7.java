package br.com.xti.aula063;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2Java7 {

	public static void main(String[] args) {
		String absolutePath = "D:/Heitor/Documents/Univ. XTI/Java(projetos eclipse)/XTI-Parte2/src/aula063/arquivo/arquivo2.txt";

		Path path = Paths.get(absolutePath);
		Charset utf8 = StandardCharsets.UTF_8;
		
		/* -ESCRITA- */
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			//acrescentado
			Files.createDirectories(path.getParent());
			
			writer.write("Carro 1");
			writer.write(" - ");
			writer.write("Heitor\n");
			
			writer.write("Carro 2");
			writer.write(" - ");
			writer.write("Maria\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* -LEITURA- */
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//coment�rios gerais:
		// java 7

		/* N�o � necess�rio incializar as vari�veis fora do try
		 * try (BufferedWriter bufferedWriter =
		 * Files.newBufferedWriter(path,utf8)){ 
		 * //acrescentei esta linha
		 * Files.createDirectories(path.getParent());
		 * 
		 * 
		 * bufferedWriter.write("Teste "); 
		 * bufferedWriter.write("Muito Massa");
		 * 
		 * // n�o precisa realizar o flush() 
		 * bufferedWriter.flush();
		 * 
		 * }
		 * 
		 * catch (IOException e){ e.printStackTrace(); 
		 * } 
		 * // n�o precisa mais do finally tamb�m. 
		 * //Antes de realizar o close da conexao, o flush � chamado
		 * finally{ 
		 * 	if(bufferedWriter != null){ 
		 *	//n�o � preciso realizar o close(). Todos os objetos que implementam a interface Closeble s�o
		 *	//automaticamente fechados (compilador criar um bloco finally para o fechamento)
		 * 	bufferedWriter.close();
		 * 	} 
		 * }
		 */

	}
	
}
