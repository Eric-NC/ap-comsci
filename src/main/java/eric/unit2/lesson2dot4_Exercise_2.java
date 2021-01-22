package eric.unit2;

import java.util.Scanner;

/*
 Write a method called monthName that accepts an integer 
 for the number of the month and prints the month's name.

Sample run:

Introduce a number for the month: 8

You selected August.

hit: You must use some if statemets

*/

// No. I won't use ifs.

public class lesson2dot4_Exercise_2 {
  public static void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("Introduce a number for the month (1-12): ");
      int i = scanner.nextInt();
      printMonthName(i);
    }
  }

  public static void printMonthName(int month) {
    String message = null;
    switch (month) {
      case 1: message = "January"; break;
      case 2: message = "February"; break;
      case 3: message = "March"; break;
      case 4: message = "April"; break;
      case 5: message = "May"; break;
      case 6: message = "June"; break;
      case 7: message = "July"; break;
      case 8: message = "August"; break;
      case 9: message = "September"; break;
      case 10: message = "October"; break;
      case 11: message = "November"; break;
      case 12: message = "December"; break;
    }
    System.out.println(message == null ? "Make sure to input a number from one to twelve." : "That month is "+message+".");
  }
}
