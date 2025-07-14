/* Aplicativo que recebe a população mundial atual e a taxa de crescimento demográfico anual e exibe
a população mundial estimada depois de um, dois, três, quatro e cinco anos. */

package io.github.juliana_barreto.cap02;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2_34 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "BR"));
        System.out.print("Informe a população mundial atual (em bilhões): ");
        double populacaoAtual = scanner.nextDouble();
        System.out.print("Informe a taxa de crescimento anual (em %): ");
        double taxaCrescimento = scanner.nextDouble();
        System.out.print("Informe o ano atual: ");
        int anoAtual = scanner.nextInt();
        scanner.close();
        System.out.printf("População atual (%d): %.2f bilhões%n", anoAtual, populacaoAtual);
        for (int i = 1; i <= 5; i++) {
            populacaoAtual *= (1 + taxaCrescimento / 100);
            System.out.printf("População estimada em %d: %.2f bilhões%n", anoAtual+i, populacaoAtual);
        }
    }
}
