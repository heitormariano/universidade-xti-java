package br.com.xti.aula028;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fluxo {

    // Estudo while e do while. Sao semelhantes ao for

    public static void main(String[] args) {

        int num = 0;

        // expressao equivale: for (int i=0;i<2;i++)
        while (num < 2) {
            System.out.println("valor do numero:" + num);
            num++; // para evitar um loop infinito, precisamos atualizar o valor de "num"
        }

        // nessa expressao o que consta no "do" eh executado pelo menos uma vez
        int num2 = 3;
        do {
            System.out.println("Imprimindo valor: " + num2);
        } while (num2 < 2);

        System.out.println();

        System.out.println("Programa Exemplo");
        ArrayList<String> produtos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes dos produtos desejados. Para finalizar, digite FIM");

        String produto;
        while (!(produto = scanner.nextLine()).equalsIgnoreCase("fim")) {
            produtos.add(produto);
        }
        System.out.println("Fim da recuperacao dos nomes dos produtos");

        System.out.println("Lista de produtos obtida");
        System.out.println(produtos);
        System.out.println();

        int numLer = -1;
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Informe os numeros que precisa em sequencia. Para encerrar, digite zero");
        while ((numLer = scanner.nextInt()) != 0) {
            numeros.add(numLer);
        }
        System.out.println("Fim da recuperacao dos numeros");

        // usando programacao declativa
        System.out.println("Numeros informados:");
        numeros.stream().toList().forEach(System.out::println);
    }
}
