package eric.unit2;

import java.util.Scanner;

/*
Write a method called monthDays that takes a parameter for the number of a month
and prints the name of the month and number of days in the month. 
Assume that February will always have 28 days for this activity.

Sample run:

Introduce a number for the month: 12

You selected December.

It has 31 days.

*/

class lesson2dot4_Exercise_3 {
  public static void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("Introduce a number for the month (1-12): ");
      int month = scanner.nextInt();
      lesson2dot4_Exercise_2.printMonthName(month);
      printMonthDays(month);
    }
  }

  private static void printMonthDays(int month) {
    int days = 0;
    switch (month) {
      case 1: days = 31; break;
      case 2: days = 28; break;
      case 3: days = 31; break;
      case 4: days = 30; break;
      case 5: days = 31; break;
      case 6: days = 30; break;
      case 7: days = 31; break;
      case 8: days = 31; break;
      case 9: days = 30; break;
      case 10: days = 31; break;
      case 11: days = 30; break;
      case 12: days = 31; break;
    }
    System.out.println(days == 0 ? "That isn't a month." : "It has "+String.valueOf(days)+" days.");
  }
}
