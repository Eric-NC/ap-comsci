package eric.unit3;

/*
In this exercise you will simulate how a point of sale machine calculates the money the cashier needs to give back to a customer after paying for goods. 
1.  Write a Java code that generate a random decimal number between 0.0 and 100.0 (not including 100)and store it in a double variable called priceOfGoods (round to two decimal places). 
2.  Add 6.75% to it (round to two decimal places) as sales tax and store the sum in a double variable called total. 
3.  Ask the user for and integer number representing how many USD they are headlining to the cashier ans store it in a integer variable called receivedMoney. 
4.  Verify that receivedMoney is enough to cover the total, if this condition is meet, print how many pennies, 
    nickles, dimes, quarters, 1-dollar bills, 5-dollar bills, 10-dollar bills, 20-dollar bills, and 50-dollar bills the cashier need to handle back to the customer.
*/
import java.util.*;

class Lesson_3dot2_Exercise_4 {
  public static void main(String[] args) {
    try (var scan = new Scanner(System.in)) {
      double priceOfGoods = Math.random() * 100;
      double total = priceOfGoods + priceOfGoods * 0.0675;

      System.out.print("The price is " + (int) (total * 100) / 100d + " USD. How many USD are you giving the cashier? ");
      double receivedMoney = scan.nextDouble();

      int pennies = (int) (receivedMoney * 100) - (int) (total * 100);

      if (pennies < 0) {
        System.out.println("That's not enough to pay the total. (Need " + pennies / 100d + " more USD)");
        return;
      }

      // I'm tired and lazy, I'm just going to hardcode this.
      // God forgive me.

      int usd50 = pennies / 5000;
      pennies -= usd50 * 5000;
      int usd20 = pennies / 2000;
      pennies -= usd20 * 2000;
      int usd10 = pennies / 1000;
      pennies -= usd10 * 1000;
      int usd5 = pennies / 500;
      pennies -= usd5 * 500;
      int usd1 = pennies / 100;
      pennies -= usd1 * 100;
      int q = pennies / 25;
      pennies -= q * 25;
      int d = pennies / 10;
      pennies -= d * 10;
      int n = pennies / 5;
      pennies -= n * 5;

      StringBuilder result = new StringBuilder("Your change is ");
      if (usd50 > 0)
        result.append(usd50 + " fifty-bills, ");
      if (usd20 > 0)
        result.append(usd20 + " twenty-bills, ");
      if (usd10 > 0)
        result.append(usd10 + " ten-bills, ");
      if (usd5 > 0)
        result.append(usd5 + " five-bills, ");
      if (usd1 > 0)
        result.append(usd1 + " single bills, ");
      if (q > 0)
        result.append(q + " quarters, ");
      if (d > 0)
        result.append(d + " dimes, ");
      if (n > 0)
        result.append(n + " nickels, ");
      result.append(pennies + " pennies.");

      System.out.println(result.toString());
    }
  }
}
