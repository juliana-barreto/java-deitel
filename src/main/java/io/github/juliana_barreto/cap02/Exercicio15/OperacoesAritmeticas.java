// Aplicativo que recebe dois inteiros e exibe a sua soma, produto, diferença e quociente

package io.github.juliana_barreto.cap02.Exercicio15;
import java.util.Scanner;
import io.github.juliana_barreto.utils.UserInput;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = UserInput.promptInt(scanner, 1);
        y = UserInput.promptInt(scanner, 2);
        scanner.close();
        System.out.println("Soma: " + (x + y));
        System.out.println("Subtração: " + (x - y));
        System.out.println("Produto: " + (x * y));
        if (y != 0) {
            System.out.printf("Divisão: %.2f%n", ((float) x / y));
        } else {
            System.out.println("Divisão: impossível dividir por zero.");
        }
    }
}

