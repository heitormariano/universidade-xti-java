package br.com.xti.aula029;

import java.util.ArrayList;
import java.util.List;

public class FibonacciV2 {

    public static void main(String[] args) {
        System.out.println("Elementos da lista Fibonacci");
        System.out.println(fibonacciMenorQue(100));
    }

    private static List<Integer> fibonacciMenorQue(int limite) {
        List<Integer> listaFibonacci = new ArrayList<>();
        listaFibonacci.add(0);
        listaFibonacci.add(1);

        while (true) {
            int tamanho = listaFibonacci.size();
            int proximo = listaFibonacci.get(tamanho - 1) + listaFibonacci.get(tamanho - 2);

            if (proximo >= limite) {
                break;
            }
            listaFibonacci.add(proximo);
        }

        return listaFibonacci;
    }
}
