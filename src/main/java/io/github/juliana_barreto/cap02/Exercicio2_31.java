/* Aplicativo que calcula os quadrados e cubos dos números de O a 10 e imprime os valores resultantes
em formato de tabela */

package io.github.juliana_barreto.cap02;

public class Exercicio2_31 {
    private static int calculaQuadrado(int num){
        return num*num;
    }
    private static int calculaCubo(int num){
        return num*num*num;
    }
    public static void main (String[] args) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("%-10s%-10s%-10s%n", "número", "quadrado", "cubo");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%-10d%-10d%-10d%n", num[i], calculaQuadrado(num[i]),
                    calculaCubo(num[i]));
        }
    }
}
