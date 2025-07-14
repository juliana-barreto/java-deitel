/* Aplicativo de calculadora de IMC que lê o peso do usuário em quilogramas e altura em metros.
Calcula e exibe o seu índice de massa corporal e avaliação de seu IMC.*/

package io.github.juliana_barreto.cap02;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2_33 {
    private static String avaliaIMC (double IMC) {
        if(IMC < 18.5) {
            return "Abaixo do peso";
        } else if (IMC < 25) {
            return "Normal";
        } else if (IMC < 30) {
            return "Acima do peso";
        } else {
                return "Obeso";
        }
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "BR"));
        double peso, altura, IMC;
        System.out.print("Insira o seu peso (em kg): ");
        peso = scanner.nextDouble();
        System.out.print("Insira a sua altura (em m): ");
        altura = scanner.nextDouble();
        IMC = peso / (altura*altura);
        System.out.printf("IMC: %.2f%n",IMC);
        System.out.println(avaliaIMC(IMC));
        scanner.close();
    }
}
