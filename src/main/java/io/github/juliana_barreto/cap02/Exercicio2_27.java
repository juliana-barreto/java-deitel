// Aplicativo que exibe um padrão de tabuleiro de damas

package io.github.juliana_barreto.cap02;

public class Exercicio2_27 {
    private static final int TAMANHO = 8;
    public static void main(String[] args) {
        for (int i = 0; i < TAMANHO; i++) {
            if (i % 2 != 0) {
                System.out.print(" ");
            }
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
