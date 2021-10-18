package br.com.xti.aula052;

public class InterfaceTeste {

	public static void area(AreaCalculavel objeto){
		System.out.println("Area: " + objeto.calcularArea());
	}
	
	public static void volume(VolumeCalculavel objeto){
		System.out.println("Volume: " + objeto.calcularVolume());
	}
	public static void main(String[] args) {
		
		area(new Quadrado(2));
		/*Quadrado quadrado = new Quadrado(2);
		
		AreaCalculavel areaCalc = quadrado;*/
		
		volume(new Cubo(3));
		area(new Cubo (2));
	}
}
