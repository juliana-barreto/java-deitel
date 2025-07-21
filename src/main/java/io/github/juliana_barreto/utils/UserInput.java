package io.github.juliana_barreto.utils;

import java.util.Scanner;

public class UserInput {
    public static void ensureInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número inteiro: ");
            scanner.next();
        }
    }
    public static int promptInt(Scanner scanner, int pos) {
        System.out.print("Digite o " + pos + "º inteiro: ");
        UserInput.ensureInt(scanner);
        return scanner.nextInt();
    }
    public static int promptInt(Scanner scanner, String msg) {
        System.out.print(msg);
        UserInput.ensureInt(scanner);
        return scanner.nextInt();
    }
    public static void ensureDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite um número real separado por \",\": ");
            scanner.next();
        }
    }
    public static double promptDouble(Scanner scanner, String msg) {
        System.out.print(msg);
        UserInput.ensureDouble(scanner);
        return scanner.nextDouble();
    }
}
