package eric.unit4;

/*
 Ask the user for two numbers. 
 Print only the even numbers between them, you should also print the two numbers if they are even.

Sample Run 1:

Enter two numbers:
3
11

4 6 8 10

Sample Run 2:

Enter two numbers:
10
44

10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44
*/

import java.util.Scanner;

class Lesson_4dot1_Exercise_2 {
  public static void main(String args[]) {
    try (var scan = new Scanner(System.in)) {
      System.out.println("Enter two integer numbers");
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      if (num1 % 2 == 1)
        num1++;
      if (num2 % 2 == 1)
        num2--;

      for (int i = num1; i <= num2; i += 2) {
        System.out.print(i);
        if (i < num2 - 1)
          System.out.print(", ");
      }
    }
  }
}