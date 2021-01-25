package eric.unit2;

import java.util.Scanner;

class L5 {
    public static void main(String[] args) {
        // EXERCISE 1
        System.out.println((int)getRandom(-20, 21));
        System.out.println((int)getRandom(20, 41));

        // EXERCISE 2
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Input two real numbers that represent a distance from (0, 0).");

            System.out.print("x = ");
            var x = scanner.nextDouble();
            System.out.print("y = ");
            var y = scanner.nextDouble();
            var d = Math.hypot(x, y);

            System.out.println("Distance from (0, 0): " + roundDouble(d, 3));

            var θ = Math.asin(x / d);
            var a = Math.cos(θ);
            var b = Math.tan(θ);

            System.out.println("θ(x) = " + roundDouble(θ, 3) + ", cos(θ) = " + roundDouble(a, 3) + ", tan(θ) = " + roundDouble(b, 3));
            System.out.println("Introduce a number.");

            System.out.print("n = ");
            var n = scanner.nextDouble();
            var loge = Math.log(n);
            var log10 = Math.log10(n);
            var en = Math.pow(Math.E, n);

            System.out.println("ln(n) = " + roundDouble(loge, 3) + ", log(n) = " + roundDouble(log10, 3) + ", e^n = " + roundDouble(en, 3));
            System.out.println("Introduce two numbers.");

            System.out.print("j = ");
            var j = scanner.nextDouble();
            System.out.print("k = ");
            var k = scanner.nextDouble();
            var max = Math.max(j, k);

            System.out.println("max(j, k) = " + roundDouble(max, 3));

            var piTimesE = Math.PI * Math.E;

            System.out.println("π × e ≈ " + piTimesE);
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }

    public static double getRandom(double min, double max) {
        return min + Math.random() * (max - min);
    }

    public static double roundDouble(double num, int places) {
        var factor = Math.pow(10, places);
        return Math.round(num * factor) / factor;
    }
}
