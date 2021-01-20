package eric.unit2;

import java.util.Scanner;
import java.lang.Math;

class Lesson2dot3_Exercise_3 {

  public static void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("Input the amount of cash invested (IN USD): ");
      var P = scanner.nextDouble();
      System.out.print("Input the interest rate (IN PERCENT): ");
      var r = scanner.nextDouble() / 100d;
      System.out.print("Input the number of times interest is compounded per month: ");
      var n = scanner.nextDouble();
      System.out.print("Input the number of months: ");
      var t = scanner.nextDouble();
      
      var interest = computeInterest(P, r, n, t);
      
      System.out.println("\nYour balance after " + t + " months: $" + Math.round(interest * 100) / 100d);
    }
  }

  private static double computeInterest(double P, double r, double n, double t) {
    return P * Math.pow(1 + r/n, n*t);
  }
}
