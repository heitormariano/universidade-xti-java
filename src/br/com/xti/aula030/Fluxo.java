package br.com.xti.aula030;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Fluxo {

	public static void main(String[] args) {
		
		/*while (true){
			
			System.out.println("Entrou");
			break;
		}*/
		
		//System.out.println("Valores da variavel i");
		
		for (int i=0; i < 10; i++){
			
			if (i == 5){
				
				continue; // para a interacao atual
				//break; //para o looping inteiro
			}
			
			System.out.println(i);
		}
		
		boolean[][] matrix = {
				{false, true, false, false, false} , 
				{false, false, false, false, false}
		};
		
		//Inicio --> acrescentado - Acessando elementos de uma matriz
		String [][] showDeBola = {
				{"A", "B", "C", "D", "E"},
				{"F", "G","H", "I","J", "K"}
		};
		
		System.out.println("Elementos da Matriz:");
		for (int i = 0; i < showDeBola.length; i++) {
			for (int j = 0; j < showDeBola[i].length; j++) {
				String elemento = showDeBola[i][j];
				System.out.println(elemento);
			}
		}
		
		//fim
		
		busca:
		for (int i = 0; i < matrix.length; i++){
			
			System.out.print("A ");
			
			for (int j = 0; j < matrix[i].length; j++){
				
				// poderia usar no "if" o seguinte: "if(matrix[i][j] == true)"
				if (matrix[i][j]){
					
					System.out.println();
					
					System.out.println("Achou o elemento True");
					
					System.out.println("indice real da dimensao: " + i);
					System.out.println("indice do elemento " + j);
					System.out.println("imprimindo elemento: " + matrix[i][j]);
					
					break busca; // Dessa forma o for externo eh parado. Se o "break" fosse usado
					//isoladamente, sem o rotulo, pararia apenas o fluxo do for interno.
				}
				
				System.out.print("B ");
			}
		}
	}
}
