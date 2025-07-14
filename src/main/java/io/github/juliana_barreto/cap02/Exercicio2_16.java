/* Aplicativo que recebe dois inteiros e exibe o maior seguido pelas palavras "é maior". Se forem
iguais, imprime a mensagem "Esses números são iguais".*/

package io.github.juliana_barreto.cap02;
import java.util.Scanner;
import io.github.juliana_barreto.utils.UserInput;

public class Exercicio2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = UserInput.promptInt(scanner, 1);
        y = UserInput.promptInt(scanner, 2);
        scanner.close();
        if (x > y) {
            System.out.println(x + " é maior.");
        }
        else if (y > y) {
            System.out.println(y + " é maior.");
        } else {
            System.out.println(x + "e" + y + "são iguais.");
        }
    }
}
