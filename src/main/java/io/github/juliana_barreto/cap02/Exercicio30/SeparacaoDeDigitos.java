/* Aplicativo que recebe um número de cinco dígitos, o separa em seus dígitos individuais e os
imprime separados um dos outros por três espaços */

package io.github.juliana_barreto.cap02.Exercicio30;
import java.util.Scanner;

public class SeparacaoDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Insira um inteiro de 5 dígitos: ");
            num = scanner.nextInt();
        } while (num < 10000 || num > 99999);
        System.out.printf("%d   ", num / 10000);
        System.out.printf("%d   ", (num / 1000) % 10);
        System.out.printf("%d   ", (num / 100) % 10);
        System.out.printf("%d   ", (num / 10) % 10);
        System.out.printf("%d   ", num % 10);
    }
}
