package eric.unit2;

/*
 Write two methods to manipulate numbers.

The first method named�sum takes 3 double numbers and returns the sum of them.

The second methods named average returns the average of the same three numbers.

Sample run:

Introduce first number: 5.5

Introduce second number: 20.1

Introduce third number: 99.9

The sum of these numbers is 125.5

The average of this numbers is 41.8333333333
*/

import java.util.Scanner;

class Lesson2dot5_Exercise_1 {
  public static void main(String args[]) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Introduce first number: ");
      double num1 = scan.nextDouble();

      System.out.print("Introduce second number: ");
      double num2 = scan.nextDouble();

      System.out.print("Introduce third number: ");
      double num3 = scan.nextDouble();

      System.out.println("The sum of these numbers is " + sum(num1, num2, num3));
      System.out.println("The avg of these numbers is " + avg(num1, num2, num3));
    }
  }

  static double sum(double a, double b, double c) {
    return a + b + c;
  }

  static double avg(double a, double b, double c) {
    return sum(a, b, c) / 3d;
  }
}