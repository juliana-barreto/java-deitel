/* Aplicativo que calcula o custo diário de dirigir e estima quanto dinheiro o usuário pode
economizar com o uso da faixa solidária */

package io.github.juliana_barreto.cap02;
import java.util.Locale;
import java.util.Scanner;
import io.github.juliana_barreto.utils.UserInput;

public class Exercicio2_35 {
    private static double calculaEconomia(double custo, int divisao) {
        return custo - (custo/divisao);
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "BR"));
        double kmDiario = UserInput.promptDouble(scanner,
                "Quilômetros totais dirigidos por dia: ");
        double precoLitro = UserInput.promptDouble(scanner, "Preço por litro da gasolina: ");
        double kmPorLitro = UserInput.promptDouble(scanner, "Quilômetros médios por litro: ");
        double gasolinaDiaria = (kmDiario / kmPorLitro) * precoLitro;
        double estacionamentoDiario = UserInput.promptDouble(scanner,
                "Taxas de estacionamento por dia: ");
        double pedagioDiario = UserInput.promptDouble(scanner, "Pedágio por dia: ");
        double custoDiario = gasolinaDiaria + estacionamentoDiario + pedagioDiario;
        int passageiros = UserInput.promptInt(scanner,
                "Incluindo você, qual o número total de ocupantes no veículo? ");
        System.out.printf("Custo diário de dirigir: %.2f%n", custoDiario);
        System.out.printf("Economia com o uso da faixa solidária: R$%.2f%n",
                calculaEconomia(custoDiario, passageiros));
    }
}
