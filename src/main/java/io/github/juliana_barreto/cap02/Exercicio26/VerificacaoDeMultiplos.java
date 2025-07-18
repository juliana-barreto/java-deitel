/* Aplicativo que recebe dois inteiros, determina se o primeiro é múltiplo do segundo e imprime o
resultado*/

package io.github.juliana_barreto.cap02.Exercicio26;
import io.github.juliana_barreto.utils.UserInput;
import java.util.Scanner;

public class VerificacaoDeMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int x = UserInput.promptInt(scanner, 1);
            int y = UserInput.promptInt(scanner, 2);
            if (x % y == 0) {
                System.out.print(x + " é múltiplo de " + y);
            } else {
                System.out.print(x + " não é múltiplo de " + y);
            }
    }
}
