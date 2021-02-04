package eric.unit3;

/*
Write code to input an integer grade from the keyboard and translate it to a letter grade. Use this grade scale:�

A� �93-100
B� �85-92
C� 77-84
D� 70-77
F� � 0-69

Sample run:
Introduce a grade (0-100): �90
90 is equivalent to B
*/
import java.util.Scanner;

class Lesson_3dot2_Exercise_3 {
  public static void convertGradeToLetterGrade(int num1) {
    String grade;
    
    if (num1 >= 93)
      grade = "A";
    else if (num1 >= 85)
      grade = "B";
    else if (num1 >= 77)
      grade = "C";
    else if (num1 >= 70)
      grade = "D";
    else
      grade = "F";
    
    System.out.println(num1 + " is equal to " + grade);
  }

  public static void main(String[] args) {
    int num1 = getGrade("Introduce a grade (0-100): ");

    convertGradeToLetterGrade(num1);
  }

  public static int getGrade(String message) {
    System.out.print(message);
    try (var scan = new Scanner(System.in)) {
      return scan.nextInt();
    }
  }
}
