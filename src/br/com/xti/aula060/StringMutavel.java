package br.com.xti.aula060;

public class StringMutavel {

		// o texto de um objeto String nunca pode ser modificado. 
		//Agora o texto de um objeto StringBuffer pode ser alterado
		
		//String: N�O muda
		//StringBuffer: muda
	
	public static void main(String[] args) {
	
		// StringBuffer e StringBuilder possuem o mesmo conjunto de m�todos
		//diferen�a: m�todos de StringBuffer s�o sincronizados. Bom para ambientes multiprocessados
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		System.out.println("Tamanho:" + s1.length());
		System.out.println("capacidade:" + s1.capacity()); /**essa capacidade � incrementada a medida que 
		s�o inclu�dos mais conte�dos no objeto */
		
		//inverter a ordem dos caracteres
		
		/*System.out.println(s1);
		s1.reverse();
		System.out.println(s1); */
		
		s1.append(" Trabalhando ");
		char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" textos");
		
		System.out.println(s1);
		
		
		//explica��o do funcionamento da m�quina virtual 
		
		String s = "oi" + " como " + "vai voc�?";
		
		//a concatena��o acima funciona de forma semelhante a esta:
		
		String sBuilder = new StringBuilder("oi").append(" como ").append("vai vo�?").toString();
		System.out.println(sBuilder);
		
		//a instrucao acima eh feita como se fosse da seguinte forma:
		/*StringBuilder sBuilder = new StringBuilder("Oi").append(" como ").append("vai voce?");
		String texto = sBuilder.toString();*/
		
		//tirar parte de um texto
		//metodo de remocao: delete(). Informar onde comeca e termina (�ndice final - 1) a remocao
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println(url);
		
	}
}
