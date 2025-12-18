package br.com.xti.aula026;

public class Fluxo {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor da variavel i (" + i + "): " + i);
        }

        String texto = ""; // valor apenas para inicializar a variavel.
        int i = 0;
        for (i = 0; i < 3; i++) {
            texto += i + ",";
        }
        texto += i;
        System.out.println(texto);

        String texto2 = "";
        for (i = 10; i > 1; i--) {
            texto2 += i + ",";
        }
        texto2 += i;
        System.out.println(texto2);

        // verificando todos os numeros pares e impares entre 0 e 20.
        System.out.println(); // pular uma linha

        for (i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("O numero " + i + " - par");
            } else {
                System.out.println("O numero " + i + " - impar");
            }
        }

        // fazendo um quadrado com "*"
        System.out.println();

        int tamanho = 5;
        for (i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("* ");
            }
            // quebra de linha
            System.out.println();
        }

    }
}
