package eric.unit3;

/*
 Write code that ask the user for three integers and check if all of them are non-negative numbers.

Sample run 1:

Enter three Integers:

0

2

3

Are all of them non-negative? true

Sample run 2:

Enter three Integers:

0

-2

3

Are all of them non-negative? false
*/
import java.util.Scanner;

class Lesson3dot1_Exercise_2 {
  public static void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter three Integers: ");
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int num3 = scanner.nextInt();

      System.out.println("Are all of them non-negative? " + (num1 >= 0 && num2 >= 0 && num3 >= 0));
    }
  }
}