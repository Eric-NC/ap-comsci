package eric.unit1;

/*
  Write a Java program that ask the user for three int grades and then sum and average them. Use casting to report the result as a double.

Sample run:

Introduce three integers:
90
100
94
The sum of the three numbers is 90 + 100 + 94 = 284
Thee average is the sum 284 divided by 3 which casted to a double is 94.666667
*/

import java.util.Scanner;

class Lesson1dot5_Activity_1 {
    public static void main(String args[]) {
        System.out.println("Three numbers:");
        try (var scanner = new Scanner(System.in)) {
            double[] result = new double[] { scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble() };
            double sum = result[0] + result[1] + result[2];
            System.out.println("The sum is " + result[0] + " + " + result[1] + " + " + result[2] + " = " + sum);
            System.out.println("The average is " + sum + " / 3 = " + (sum / 3d));
        }
    }
}
