/* Aplicativo que lê a entrada a partir do usuário do raio de um círculo como um inteiro e imprime o
diâmetro do círculo, a circunferência e área. */

package io.github.juliana_barreto.cap02;
import io.github.juliana_barreto.utils.UserInput;
import java.util.Scanner;

public class Exercicio2_28 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o raio do círculo (em cm): ");
        UserInput.ensureInt(scanner);
        int raio = scanner.nextInt();
        System.out.println("Diâmetro: "+2*raio+"cm");
        System.out.printf("Circunferência: %.2f cm%n",2*Math.PI*raio);
        System.out.printf("Área: %.2f cm%n",Math.PI*Math.pow(raio,2));
    }
}
