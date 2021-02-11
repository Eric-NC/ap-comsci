package eric.unit4;

/*
 Write a program that will input a list of test scores in from the keyboard. 
 When the user enters -1, print the average.

What do you need to be careful about when using -1 to stop a loop?

Sample Run:

Enter the Scores:
45
100
-1

The average is: 72.5
*/

import java.util.Scanner;

class Lesson_4dot1_Exercise_1 {
  public static void main(String args[]) {
    int score = 0, total = 0, counter = 0;

    System.out.println("Enter the scores:");
    
    try (var scanner = new Scanner(System.in)) {
      while (true) {
        score = scanner.nextInt();
        if (score == -1)
          break;
        total += score;
        counter++;
      }
    }
    
    System.out.println("The average is: " + total / (double)counter);
  }
}
