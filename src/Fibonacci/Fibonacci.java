package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe uma sequência numérica separada por espaço: ");
        String input = ler.nextLine();
       ler.close();

        String[] numerosString = input.split(" ");
        int[] numeros = new int[numerosString.length];

        for (int i = 0; i < numerosString.length; i++) {
            numeros[i] = Integer.parseInt(numerosString[i]);
        }

        boolean fibonacci = true;
        for (int i = 2; i < numeros.length; i++) {
            if (numeros[i] != numeros[i-1] + numeros[i-2]) {
                fibonacci = false;
                break;
            }
        }
        if (fibonacci) {
            System.out.println("Esses valores é uma sequência de Fibonacci.");
        } else {
            System.out.println("Esses valores não é uma sequência de Fibonacci.");
        }
    }
}
