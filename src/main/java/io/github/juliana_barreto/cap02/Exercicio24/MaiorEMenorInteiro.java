// Aplicativo que recebe cinco inteiros, determina e imprime o maior e o menor inteiro no grupo

package io.github.juliana_barreto.cap02.Exercicio24;
import io.github.juliana_barreto.utils.UserInput;
import java.util.Scanner;

public class MaiorEMenorInteiro {
    private static final int QUANTIDADE = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[QUANTIDADE];
        for (int i = 0; i < QUANTIDADE; i ++) {
            num[i] = UserInput.promptInt(scanner, i);
        }
        int maiorNum = num[0], menorNum = num[0];
        for (int i = 0; i < QUANTIDADE; i++) {
            if (num[i] > maiorNum) {
                maiorNum = num[i];
            } else if (num[i] < menorNum){
                menorNum = num[i];
            }
        }
        System.out.println("Maior número: "+maiorNum);
        System.out.println("Menor número: "+menorNum);
    }
}
