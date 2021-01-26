package eric.unit2;

/*
 In this exercise, you will read a text file using the java.util.Scanner, and the java.io.File classes. The text will be stored in a String.

Your will ask the user for a keyword or phrase to be searched�in the text.
If the phrase is found, print the index of the last occurrence.
Check if the text contains any month of the year, (if so, print it).
Extra credit: Print the full text from the last character to the first (this is backwards).
 */

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Lesson2dot7_Exercise_4 {
  public static void main(String[] args) {
    var text = readFile();
    if (text == null) {
      return;
    }

    System.out.print("Full text:\n-------------------------\n" + text + "\n-------------------------\n");

    try (var scanner = new Scanner(System.in)) {
      System.out.println("Input a search phrase.");
      var phrase = scanner.nextLine();
      int index = text.lastIndexOf(phrase);
      if (index != -1) {
        System.out.println("Match starts at index " + index + ".");
      }
    }

    for (int m = 1; m <= 12; m++) {
      var name = lesson2dot4_Exercise_2.getMonthName(m);
      int index = text.indexOf(name);
      if (index != -1) {
        System.out.println("Month '" + name + "' found at index " + index + ".");
      }
    }

    // Wait so the user can actually read the results before spitting out the
    // reverse text
    System.out.println("Printing text in reverse.");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      System.out.println("Thread was interrupted!");
    }

    var reverseText = new StringBuilder(text).reverse().toString();
    System.out
        .print("Full text in reverse:\n-------------------------\n" + reverseText + "\n-------------------------\n");
  }

  public static String readFile() {
    try {
      return Files.readString(Path.of("APCSA.txt"));
    } catch (Exception e) {
      System.out.println("An error occurred. " + e.getMessage());
    }
    return null;
  }
}