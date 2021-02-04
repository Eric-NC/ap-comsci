package eric.unit3;

/*
 Write a code that test if a number even or odd, if it is multiplier of 5, 10, 20,50 and 100.
*/
import java.util.Scanner;

class Lesson_3dot2_Exercise_2 {
  public static void main(String[] args) {
    int num1 = getDecimal("Introduce a integer number: ");
    isOddOrEven(num1);
    isMultiplierOfX(num1, 5);
    isMultiplierOfX(num1, 10);
    isMultiplierOfX(num1, 20);
    isMultiplierOfX(num1, 50);
    isMultiplierOfX(num1, 100);
  }

  public static int getDecimal(String message) {
    System.out.print(message);
    try (var scan = new Scanner(System.in)) {
      return scan.nextInt();
    }
  }

  public static void isOddOrEven(int num1) {
    System.out.println(num1 + (num1 % 2 == 0 ? " is even." : " is odd."));
  }

  public static void isMultiplierOfX(int num1, int X) {
    System.out.println(num1 + (num1 % X == 0 ? " is " : " is not ") + "a multiple of " + X + ".");
  }
}
