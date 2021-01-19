package eric.unit1;

/*
 * Leson 1.3 Activity 1
 * Movie ratings
 * 
 * Hints:
 * to round a double number to n decimals (n>0)
 *                           multiply the double times 10^n
 *                           cast the number to integer
 *                           cast the number back to double
 *                           divide the number by 10^n
 * */

// Or just use Math.round :)

import java.util.Scanner;
import java.lang.Math;

class Lesson1dot3_Activity_1 {
    public static void main(String args[]) {
        try (var scanner = new Scanner(System.in)) {
            // Prompt user
            System.out.println("Three user ratings?");
            var userScores = new int[] { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };

            System.out.println("\nTwo ratings from the focus group?");
            var focusScores = new double[] { scanner.nextDouble(), scanner.nextDouble() };

            System.out.println("\nAverage critic rating?");
            var critic = scanner.nextDouble();

            // Calc averages
            var userAvg = (userScores[0] + userScores[1] + userScores[2]) / 3d;
            var focusAvg = (focusScores[0] + focusScores[1]) / 2d;
            var finalAvg = userAvg * 0.2 + focusAvg * 0.3 + critic * 0.5;

            // Print em
            System.out.println("\nUser average:         " + Math.round(userAvg * 100) / 100d);
            System.out.println("Focus group average:  " + Math.round(focusAvg * 100) / 100d);
            System.out.println("Critic average:       " + Math.round(critic * 100) / 100d);
            System.out.println("-- OVERALL AVERAGE -- " + Math.round(finalAvg * 100) / 100d);
        } catch (Exception e) {
            System.out.println("Make sure to print a valid number.");
        }
    }
}
