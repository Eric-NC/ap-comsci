package eric.unit4;

import java.util.Scanner;

public class Lesson_4dot3_Exercise_1 {

  public static void main(String args[]) {
    System.out.print("Enter a string: ");
    try (var scan = new Scanner(System.in)) {
      String str = scan.nextLine();
      str = removeSpaces(str);
      palindromeChecker(str);
    }
  }

  public static String removeSpaces(String str) {
    return str.replace(" ", "");
  }

  public static String reverseString(String str) {
    var arr = str.toCharArray();
    for (int i = 0; i < arr.length / 2; i++) {
      var temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    return new String(arr);
  }

  public static void palindromeChecker(String str) {
    System.out.println(reverseString(str).equals(str) ? "That's a palindrome!" : "Not a palindrome.");
  }
}