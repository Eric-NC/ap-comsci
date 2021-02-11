package eric.unit4;

/*
 The method�printNums�has two parameters:�value�and�numRounds. 
 The method will iterate for�numRounds�rounds. In each round, random integers between�0�and�9, inclusive, are generated and printed on a single line until�value�is generated. 
 At that time,�value�is printed and the round stops. Values for the next round are printed on the next line of output.

For example, a call to�printNums(5, 4)�could result in the following output. Each round stops when�5�is printed for a total of four rounds.

325

7884465

06165

9678971145

Complete method�printNums�below.
*/

import java.util.Scanner;
import java.awt.Toolkit;

class Lesson_4dot1_Exercise_3 {
  public static void main(String args[]) {
    try (var scan = new Scanner(System.in)) {
      System.out.print("Enter a integer between 0 and 9 (both inclusive) to be randomly generated: ");
      int num1 = scan.nextInt();
      System.out.print("Enter the number of rounds: ");
      int num2 = scan.nextInt();
      printNums(num1, num2);
      Toolkit.getDefaultToolkit().beep();
    }
  }

  public static void printNums(int target, int numRounds) {
    for (int i = 0; i < numRounds;) {
      int random = (int) (Math.random() * 10);
      System.out.print(random);
      if (random == target) {
        i++;
        System.out.println();
      }
    }
  }
}
