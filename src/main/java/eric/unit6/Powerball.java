package eric.unit6;

import java.util.*;

class Powerball {
  public static void main(String args[]) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Use quick pick? (y/n) ");

      var option = scan.nextLine().trim();
      var quickPick = option.equals("y") || option.equals("Y");
      int[] numbers;

      if (quickPick) {
        numbers = uniqueSet(69);
      } else {
        System.out.println("Enter 5 unique numbers from 1-69.");

        numbers = new int[5];
        outer: for (int i = 0; i < 5; i++) {
          int x = scan.nextInt();
          if (x < 1 || x > 69) {
            System.out.println("Invalid number.");
            i--;
            continue;
          }
          for (int j = 0; j < i; j++) {
            if (numbers[j] == x) {
              System.out.println("Number already added.");
              i--;
              continue outer;
            }
          }
          numbers[i] = x;
        }

        Arrays.sort(numbers);
      }

      System.out.println("Chosen numbers: " + Arrays.toString(numbers));

      int powerballNumber = 0;
      if (quickPick) {
        powerballNumber = getRandomNumber(26);
      } else {
        while (powerballNumber < 1 || powerballNumber > 26) {
          System.out.println("Enter a number from 1-26.");
          powerballNumber = scan.nextInt();
        }
      }

      System.out.println("Chosen powerball number: " + powerballNumber);
      
      // NOTE:
      // This could be optimized by precalculating the chosen numbers,
      // then for each user-given number, checking then and there if it's a matched number.
      // This would avoid a second iteration.
      // However, since this is such a small problem, I really don't care.

      int[] drawnNumbers = uniqueSet(69);

      System.out.println("Drawing numbers: " + Arrays.toString(drawnNumbers));

      int drawnPowerballNumber = getRandomNumber(26);

      System.out.println("Drawing powerball number: " + drawnPowerballNumber);

      int matches = 0;
      for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < drawnNumbers.length; j++) {
          if (numbers[i] == drawnNumbers[j]) {
            matches++;
          }
          else if (numbers[i] < drawnNumbers[j]) {
            // Since the array is sorted, if the RHS is greater than the LHS, then they will never be equal.
            // Therefore we can just break this iteration.
            break;
          }
        }
      }

      int centPrize = getPrize(powerballNumber == drawnPowerballNumber, matches);
      
      if (centPrize > 0) {
        System.out.println("You matched " + matches + " numbers " + (powerballNumber == drawnPowerballNumber ? "and the powerball " : "") + ". You won $" + centPrize / 100d + ".");
      } else {
        System.out.println("Sorry! You matched " + matches + " number(s). Better luck next time!");
      }
    } catch (Exception e) {
      System.out.println("Invalid input. Aborting.");
    }
  }

  private static int getPrize(boolean matchedPowerball, int matches) {
    if (matchedPowerball) {
      if (matches == 5) return 100000;
      if (matches == 4) return 5000;
      if (matches == 3) return 1000;
      if (matches == 2) return 70;
    }
    if (matches == 5) return 10000;
    if (matches == 4) return 1000;
    if (matches == 3) return 70;
    return 0;
  }

  static int[] uniqueSet(int max) {
    var numbers = new int[5];
    outer: for (int i = 0; i < 5; i++) {
      int x = getRandomNumber(max);
      for (int j = 0; j < i; j++) {
        if (numbers[j] == x) {
          i--;
          continue outer;
        }
      }
      numbers[i] = x;
    }
    Arrays.sort(numbers);
    return numbers;
  }

  static int getRandomNumber(int max) {
    return (int) (Math.random() * max) + 1;
  }
}