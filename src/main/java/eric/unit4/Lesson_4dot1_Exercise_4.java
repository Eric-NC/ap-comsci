package eric.unit4;

/*
Write java code to ask the user to input an integer and then it should output the number with the digits reversed. 

Sample run:

Enter an integer number: 20201031

This numbers backwards: 13010202
*/

import java.util.Scanner;

class Lesson_4dot1_Exercise_4 {
  public static void main(String args[]) {
    try (var scan = new Scanner(System.in)) {
      System.out.print("Enter an integer number: ");
      int num = scan.nextInt();
      PrintNumberBackwards(num);
    }
  }

  public static void PrintNumberBackwards(int number) {
    // Could be more efficient but meh
    var str = new StringBuilder(String.valueOf(number));
    System.out.println("This number backwards: " + str.reverse());
  }
}
