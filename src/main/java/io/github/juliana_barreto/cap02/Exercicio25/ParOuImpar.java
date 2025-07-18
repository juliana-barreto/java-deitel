// Aplicativo que recebe um inteiro, determina e imprime se ele é par ou ímpar.

package io.github.juliana_barreto.cap02.Exercicio25;
import io.github.juliana_barreto.utils.UserInput;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = UserInput.promptInt(scanner, "Insira um inteiro: ");
            if (x % 2 == 0) {
                System.out.println(x+" é par");
            } else {
                System.out.println(x+" é ímpar");
            }
    }
}
