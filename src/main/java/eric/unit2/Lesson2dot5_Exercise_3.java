package eric.unit2;

/*
Write a method that takes three integers and returns true if all the numbers are non-negative, false otherwise.

Sample run:

Introduce first number: 25

Introduce second number: 20

Introduce third number: -25

Are all numbers in the series non-negative? false
*/

import java.util.Scanner;

class Lesson2dot5_Exercise_3 {
  public static void main(String args[]) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Introduce first number: ");
      int num1 = scan.nextInt();

      System.out.print("Introduce second number: ");
      int num2 = scan.nextInt();

      System.out.print("Introduce third number: ");
      int num3 = scan.nextInt();

      System.out.println("Are all numbers in the series non-negative? " + areAllNegative(num1, num2, num3));
    }
  }

  static boolean areAllNegative(int a, int b, int c) {
    return a >= 0 && b >= 0 && c >= 0;
  }
}