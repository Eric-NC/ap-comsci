package eric.unit3;

/*
 Write code to test if a integer is�NOT in between 5 and 125 (both inclusive).

Sample run 1:

Enter a number: 10

false

Sample run 2:

Enter a number: 200

true
*/

import java.util.Scanner;

class Lesson3dot1_Exercise_1 {
  public static void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter a number: ");
      int num = scanner.nextInt();
      
      System.out.println(num < 5 || num > 125);
    }
  }
}
