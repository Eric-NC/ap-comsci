package eric.unit2;

import java.util.Scanner;

class Lesson2dot7_Exercise_2 {

  public static void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      var str = scanner.next();

      for (int i = 0; i < str.length(); i++) {
        System.out.println(str.charAt(i));
      }
    }
  }
}