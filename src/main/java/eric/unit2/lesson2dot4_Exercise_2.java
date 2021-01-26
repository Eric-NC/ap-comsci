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
    var m = getMonthName(month);
    System.out.println(m == null ? "Make sure to input a number from one to twelve." : "That month is "+m+".");
  }

  public static String getMonthName(int month) {
    switch (month) {
      case 1: return "January";
      case 2: return "February";
      case 3: return "March";
      case 4: return "April";
      case 5: return "May";
      case 6: return "June";
      case 7: return "July";
      case 8: return "August";
      case 9: return "September";
      case 10: return "October";
      case 11: return "November";
      case 12: return "December";
    }
    return null;
  }
}
