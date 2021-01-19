package eric.unit1;
/*
 * Lesson 1.2 Coding Activity Question 2
 *
 * Input a positive three digit integer. Print out the digits one per line, then print another line with the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;

class Lesson1dot3_Activity_2 {
    public static void main(String[] args) {
        // Prompt user
        int result;

        System.out.println("Input a number.");

        try (var scanner = new Scanner(System.in)) {
            result = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("That wasn't a valid number.");
            return;
        }

        System.out.println("\nDigits: ");

        var digits = String.valueOf(result).toCharArray();

        // Print digits, separated by lines
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
        System.out.println();

        // OK now do the sum.
        var sum = 0;
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);

            if (i == digits.length - 1) {
                System.out.print(" = ");
            }
            else {
                System.out.print(" + ");
            }
            sum += Character.getNumericValue(digits[i]);
        }
        System.out.print(sum);
    }
}