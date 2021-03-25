package eric.unit6;

import java.util.Scanner;

class Lesson_6dot1_Exercise_1 {
  public static void main(String args[]) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("How many numbers to sum: ");
      int arrayLength = scan.nextInt();

      int sum = 0;
      for (int i = 0; i < arrayLength; i++) {
        int x = getRandomNumber();
        System.out.println(x);
        sum += x;
      }
      System.out.println("Sum: " + sum);
    }

    // No array allocation needed
  }

  public static int getRandomNumber() {
    return (int) (Math.random() * 200) + 1;
  }
}