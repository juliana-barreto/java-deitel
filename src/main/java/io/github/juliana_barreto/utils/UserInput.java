package io.github.juliana_barreto.utils;

import java.util.Scanner;

public class UserInput {

  private UserInput() {
  }

  public static void ensureInt(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.print("Invalid input. Please enter an integer: ");
      scanner.next(); // Consume the invalid token
    }
  }

  public static int promptInt(Scanner scanner, int pos) {
    System.out.print("Enter integer #" + pos + ": ");
    UserInput.ensureInt(scanner);
    return scanner.nextInt();
  }

  public static int promptInt(Scanner scanner, String msg) {
    System.out.print(msg);
    UserInput.ensureInt(scanner);
    return scanner.nextInt();
  }

  public static void ensureDouble(Scanner scanner) {
    scanner.useLocale(Locale.US);
    while (!scanner.hasNextDouble()) {
      System.out.print("Invalid input. Please enter a decimal number: ");
      scanner.next(); // Consume the invalid token
    }
  }
}

public static double promptDouble(Scanner scanner, String msg) {
  System.out.print(msg);
  UserInput.ensureDouble(scanner);
  return scanner.nextDouble();
}
}
