package eric.unit2;

import java.util.Scanner;

class Lesson2dot3_Exercise_2 {

  public static void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("Input an integer: ");
      printSumOfDigits(scanner.nextInt());
    }
  }

  private static void printSumOfDigits(int i) {
    int sum = 0;
    while (i != 0) {
      sum += i % 10;
      i /= 10;
    }
    System.out.println("The sum of the digits is " + sum + ".");
  }
}
