package eric.unit1;

/*
 Write a Java program that ask the user for weight in pounds and height in inches, then convert the weight to kilograms, the height to meters, and compute body mass index (BMI). Take in cosideration that

BMI= weight (in Kilogram) / height^2 (in meters)

1 lb = 0.453592 kilograms

1 in = 0.0254 meters




Sample run:

Input weight in pounds:� 182
Input height in inches: 72

Your weight is 205.023584 Kgr

Your height is 1.8288 m

Your BMI =� 24.68336 Kgr/m^2

*/
import java.util.Scanner;

class Lesson1dot5_Activity_3 {
    public static void main(String args[]) {
        try (var scanner = new Scanner(System.in)) {
            System.out.print("Input weight in pounds: ");
            var lbs = scanner.nextDouble();
            System.out.print("Input weight in inches: ");
            var ins = scanner.nextDouble();
            var kgs = lbs * 0.453592;
            var mts = ins * 0.0254;
            System.out.println(
                    "Your weight in kilograms is " + kgs + " and your height in centimeters is " + mts * 100 + ".");
            System.out.println("Therefore, your BMI is " + (kgs / (mts * mts)) + ".");
        }
    }
}