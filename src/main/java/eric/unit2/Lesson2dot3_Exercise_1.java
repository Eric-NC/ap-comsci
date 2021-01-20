package eric.unit2;

import java.util.Scanner;

class Lesson2dot3_Exercise_1 {
  public void main(String args[]) {
    try (var scanner = new Scanner(System.in)) {
      System.out.print("Input the first number: ");
      int first = scanner.nextInt();
      System.out.print("Input the second number: ");
      int second = scanner.nextInt();
      System.out.print("Input the third number: ");
      int third = scanner.nextInt();
      
      new Class_A(first, second, third).printAverage();
    }
  }
}