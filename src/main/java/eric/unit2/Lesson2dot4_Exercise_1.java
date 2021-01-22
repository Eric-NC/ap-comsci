package eric.unit2;

/*
 Write a method called�printPowerOfN�that accepts a base and an exponent as arguments 
 and prints power of the base to the power.�

Sample run:

Introduce a base: 4

Introduce a power: 10

4^10 = 104857
*/

import java.lang.Math;
import java.util.Scanner;

class Lesson2dot4_Exercise_1 {
  public static void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("Introduce a base:  ");
      var a = scanner.nextDouble();
      System.out.print("Introduce a power: ");
      var n = scanner.nextDouble();

      printPowerOfN(a, n);
    }
  }

  private static void printPowerOfN(double base, double exponent) {
    System.out.print(base+"^"+exponent+" = "+Math.pow(base, exponent));
  }
}
