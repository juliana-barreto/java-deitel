// Aplicativo que recebe um inteiro, determina e imprime se ele é par ou ímpar.

package io.github.juliana_barreto.cap02;
import io.github.juliana_barreto.utils.UserInput;
import java.util.Scanner;

public class Exercicio2_25 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insira um inteiro: ");
            UserInput.ensureInt(scanner);
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                System.out.println(x+" é par");
            } else {
                System.out.println(x+" é ímpar");
            }
    }
}
