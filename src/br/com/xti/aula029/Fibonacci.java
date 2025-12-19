package br.com.xti.aula029;

import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args) {

        ArrayList<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        Integer elemAtual;

        for (int i = 2; fibonacci.get(i - 1) + fibonacci.get(i - 2) < 50; i++) {
            elemAtual = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(elemAtual);
        }

        System.out.println("Fibonacci [elementos menores que 50]: " + fibonacci);
    }
}
