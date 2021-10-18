package br.com.xti.aula030;

public class FluxoAula {

	public static void main(String[] args) {
		
		boolean[][] matrix = {
				{false, true, false, false, false} , 
				{false, false, false, false, false}
		};
		
		busca:
		for (int a = 0; a < matrix.length; a++){
			System.out.print("A ");
			
			for (int b = 0; b < matrix[a].length; b++){
				
				if (matrix[a][b]){
					
					System.out.println("TRUE ");
					break busca; // Dessa forma o for externo eh parado. Se o "break" fosse usado
					//isoladamente, sem o rotulo, pararia apenas o fluxo do for interno.
				}
				
				System.out.print("B ");
			}
		}
	}
}
