package eric.unit2;

/*
Write two methods to evaluate integers.

The first method, named findMax, takes three integers and return the value of the higher one.

The second method, named findMin, takes three integers and return the lower one.

Sample run:

Introduce first number: 25

Introduce second number: 20

Introduce third number: -25

The maximum number is 25

The minimum number is -25
*/

import java.util.Scanner;

class Lesson2dot5_Exercise_2 {
  public static void main(String args[]) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Introduce first number: ");
      int num1 = scan.nextInt();

      System.out.print("Introduce second number: ");
      int num2 = scan.nextInt();

      System.out.print("Introduce third number: ");
      int num3 = scan.nextInt();

      System.out.println("The maximum number is " + findMax(num1, num2, num3));
      System.out.println("The minimum number is " + findMin(num1, num2, num3));
    }
  }

  static int findMax(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    }
    if (b > a && b > c) {
      return b;
    }
    return c;
  }

  static int findMin(int a, int b, int c) {
    if (a < b && a < c) {
      return a;
    }
    if (b < a && b < c) {
      return b;
    }
    return c;
  }
}