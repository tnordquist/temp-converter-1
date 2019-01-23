package edu.cnm.deepdive;

import java.util.Scanner;

public class TempConverter {

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean trueOrFalse;

    do {
      double fahrenheit;
      double celsius;
      System.out.print("Enter a temperature in Fahrenheit: ");
      fahrenheit = input.nextDouble();
      celsius = (fahrenheit - 32) * 5 / 9;
      System.out.println(celsius);
      System.out.print("Convert another (true/false)? ");
      trueOrFalse = input.nextBoolean();
    } while (trueOrFalse);
  }
}
