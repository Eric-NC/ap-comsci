package eric.unit6;

import java.util.Scanner;

class Lesson_6dot1_Exercise_1 {
  public static void main(String args[]) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("How many numbers to sum: ");
      int arrayLength = scan.nextInt();

      int sum = 0;
      for (int i = 0; i < arrayLength; i++) {
        int x = getRandomNumber();
        System.out.println(x);
        sum += x;
      }
      System.out.println("Sum: " + sum);
    }

    // No array allocation needed
  }

  public static int getRandomNumber() {
    return (int) (Math.random() * 200) + 1;
  }
}

class Planets {
  public static void main(String args[]) {
    String[] planets = { "Mercury, the smallest", "Venus, the hottest", "Earth, our home", "Mars, our sister planet", "Jupiter, the biggest", "Saturn, the prettiest", "Uranus, the tilted planet", "Neptune, the furthest" };
    double[] diameter = { 3031, 7521, 7926, 4222, 88846, 74900, 31763, 30779 };
    double[] distance = { 36000000, 67000000, 92960000, 141700000, 483500000, 888750000, 888750000, 1783744300, 2797770000.0 };
    int[] satellites = { 0, 0, 1, 2, 79, 82, 27, 14 };
    boolean[] rings = { false, false, false, false, true, true, true, true };

    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Our solar system has 8 planets:\n" + 
      "(1) Mercury    (2) Venus    (3) Earth    (4) Mars    (5) Jupiter    (6) Saturn    (7) Uranus    (8) Neptune");

      while (true) {
        System.out.print("\nSelect one to get info, or a different input to exit. ");
        int choice = scan.nextInt() - 1;
        if (choice < 0 || choice > 7) {
          break;
        }
        System.out.println(planets[choice]);
        System.out.println("Distance from our sun: " + distance[choice]);
        System.out.println("Diameter: " + diameter[choice]);
        System.out.println("Number of natural satellites: " + satellites[choice]);
        System.out.println(rings[choice] ? "No rings." : "Has rings.");
      }
    }
    catch (Exception e) {}
  }
}