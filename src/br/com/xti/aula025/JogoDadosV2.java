package br.com.xti.aula025;

import java.util.Random;
import java.util.Scanner;

public class JogoDadosV2 {

    private static final Random random = new Random();
    private static final int MAX_DADO = 6;

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogo de dados V2!");

        int palpite = lerPalpite(scanner);

        if (!isPalpiteValido(palpite)) {
            System.out.println("Palpite inválido. Digite um número entre 1 e 6.");
        } else {
            int numeroDado = obterValorDado();
            System.out.println("Valor do dado: " + numeroDado);

            verificarResultado(palpite, numeroDado);
        }
        scanner.close();
    }

    private static int lerPalpite(Scanner scanner) {
        System.out.println("Digite um palpite [entre 1 e 6]:");
        if (!scanner.hasNextInt()) {
            return -1;
        }
        return scanner.nextInt();
    }

    private static boolean isPalpiteValido(int palpite) {
        return palpite > 0 && palpite <= 6;
    }

    private static int obterValorDado() {
        return random.nextInt(MAX_DADO) + 1; // possibilidades: 1 ate 6
    }

    private static void verificarResultado(int palpite, int numeroDado) {
        if (palpite == numeroDado) {
            System.out.println("Palpite correto. Voce acertou o numero do dado");
        } else {
            System.out.println("Tente de novo. Palpite incorreto");
        }
    }
}
