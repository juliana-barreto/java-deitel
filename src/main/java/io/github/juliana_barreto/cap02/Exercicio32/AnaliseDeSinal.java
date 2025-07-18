// Programa que recebe cinco números, determina e imprime quantos são negativos, positivos e zeros.

package io.github.juliana_barreto.cap02.Exercicio32;
import java.util.Scanner;
import io.github.juliana_barreto.utils.UserInput;

public class AnaliseDeSinal {
    private static final int QUANTIDADE = 5;
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[QUANTIDADE];
        int negativos = 0, positivos = 0, zeros = 0;
        for (int i = 0; i < QUANTIDADE; i++) {
            num[i] = UserInput.promptInt(scanner, i+1);
            if (num[i] < 0 ) {
                negativos++;
            } else if (num[i] > 0) {
                positivos++;
            } else {
                zeros++;
            }
        }
        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);
        System.out.println("Quantidade de zeros: " + zeros);
    }
}
