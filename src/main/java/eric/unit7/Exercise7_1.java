package eric.unit7;

import java.util.*;

public class Exercise7_1 {
  public static void main(String[] args) {
    System.out.println("Enter text. Exit by typing STOP on a new line.");
    try (var scanner = new Scanner(System.in)) {
      var items = new ArrayList<String>();
      while (true) {
        var input = scanner.nextLine();
        if (input.equals("STOP")) {
          break;
        }
        items.add(input);
      }
      System.out.println("You entered " + items.size() + " elements.\n" + items);
      if (items.size() > 2) {
        items.remove(items.size() - 1);
        items.remove(0);
      }
      System.out.println("Sans first and last elements: \n" + items);
    }
  }
}
