//Aplicativo que recebe três inteiros e exibe a soma, média, produto e os números menores e maiores

package io.github.juliana_barreto.cap02;
import java.util.Scanner;
import io.github.juliana_barreto.utils.UserInput;

public class Exercicio2_17 {
    private static int encontrarMaior (int x, int y, int z){
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }
    private static int encontrarMenor (int x, int y, int z) {
        if (x <= y && x <= z) {
            return x;
        } else if (y <= x && y <= z) {
            return y;
        } else {
            return z;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        x = UserInput.promptInt(scanner, 1);
        y = UserInput.promptInt(scanner, 2);
        z = UserInput.promptInt(scanner, 3);
        scanner.close();
        System.out.println("Soma: " + (x + y + z));
        System.out.printf("Média: %.2f%n", (float)(x + y + z) / 3);
        System.out.println("Produto: " + (x * y * z));
        if (x == y && x == z) {
            System.out.println("Os números são iguais");
        }
        else {
            System.out.println("O maior número é " + encontrarMaior(x, y, z));
            System.out.println("O menor número é " + encontrarMenor(x, y, z));
        }
    }
}
