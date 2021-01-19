package eric.unit1;

/*
 Unicode is an international standard where each letter in any alphabet is represented by a number. Unicode uses hex code (a base 16 code that uses the digits 0-9 and the letters A-F for 10-15), but you can give Java an equivalent decimal number and type cast it to the type char (for character) to show the unicode character.

Write a Java programs that� ask the user for an integer number, prints out the unicode value of that number (look at�this�Unicode Lookup�site)�

Sample run:

Introduce a integer number:

632

The unicode character represented by 632 is:� ?

*/

import java.util.Scanner;

class Lesson1dot5_Activity_2 {
    public static void main(String args[]) {
        System.out.print("Input an integer. ");
        try (var scanner = new Scanner(System.in)) {
            var input = scanner.nextInt();
            System.out.println("In Unicode, that is: " + (char) input);
        }
    }
}