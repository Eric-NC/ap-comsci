package eric.unit4;

/*
 Write java code that ask the user for a integer number in between 1 and 100 (repeat this question until the number meet the requirement), 
 then ask the user for a second integer number in between 200 and 1000 (repeat this question until the number meet the requirement). 
 When the two number meet the requirements, use a for loop to print all the even numbers from the first number to the second number, 
 with 10 numbers on each line. Print one space between each number.

Sample run:

Pleaser enter a number in between 1 and 100: �21
Pleaser enter a number in between 200 and 1000: �200
22 24 26 28 30 32 34 36 38 40
42 44 46 48 50 52 54 56 58 60
62 64 66 68 70 72 74 76 78 80
82 84 86 88 90 92 94 96 98 100
102 104 106 108 110 112 114 116 118 120
122 124 126 128 130 132 134 136 138 140
142 144 146 148 150 152 154 156 158 160
162 164 166 168 170 172 174 176 178 180
182 184 186 188 190 192 194 196 198 200
>�
 
 */

import java.util.Scanner;

class Lesson_4dot2_Exercise_2 {
  public static void main(String args[]) {
    try (var scan = new Scanner(System.in)) {
      System.out.print("Enter a number from [1, 100]: ");

      int first = 0;
      while (first < 1 || first > 100)
        first = scan.nextInt();

      System.out.print("Enter a number from [200, 1000]: ");

      int second = 0;
      while (second < 200 || second > 1000)
        second = scan.nextInt();

      if (first % 2 == 1)
        first++;
      if (second % 2 == 1)
        second--;
      
      int count = 0;
      for (int i = first; i <= second; i += 2) {
        if (count >= 10) {
          count = 0;
          System.out.println();
        }
        count++;
        System.out.print(i + " ");
      }
    }
  }
}