package eric.unit3;

/*
 Write code to read to decimals from the keyboard and compare their values. Print if the first number is equal, lesser or higher that the second.

Sample run 1:

Introduce a decimal number: 5.5

Introduce a second decimal number: 5.5

Your first decimal (5.5) is equal to your second decimal (5.5)

Sample run 2:

Introduce a decimal number: 5.5

Introduce a second decimal number: 3.141592

Your first decimal (5.5) is greater than your second decimal (3.141592)

Sample run 2:

Introduce a decimal number: 5.5

Introduce a second decimal number: 5.5012

Your first decimal (5.5) is lesser than your second decimal (5.5012)
*/
import java.util.Scanner;

class Lesson_3dot2_Exercise_1 {
  private static Scanner scan = new Scanner(System.in);

  public static void compareNumbers(double num1, double num2) {
    if (num1 < num2)
      System.out.println(num1 + " < " + num2);
    else if (num1 == num2)
      System.out.println(num1 + " = " + num2);
    else
      System.out.println(num1 + " > " + num2);
  }

  public static void main(String[] args) {
    double num1 = getDecimal("Introduce a decimal number: ");
    double num2 = getDecimal("Introduce a second decimal number: ");
    compareNumbers(num1, num2);
  }

  public static double getDecimal(String message) {
    System.out.print(message);
    return scan.nextDouble();
  }
}
