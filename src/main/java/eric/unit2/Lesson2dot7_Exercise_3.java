package eric.unit2;

/*
 * In many methods of communication throughout the last century, from telegrams to SMS messages to tweets, 
 * there is a benefit to reducing message length: either the number of characters is limited or using more characters incurs extra cost. 
 * Your job in this assignment is to write a program which takes a message as a string and reduces the number of characters it 
 * uses in a set way.
 * The first thing your program will do is ask the user to type a message which will be stored as a String. 
 * If the message contains less than 10 characters the program should print �This doesn�t need shortening!� and finish.
 * Otherwise, the message should be immediately converted to lowercase as this will make processing much easier. 
 * The program should then create a string in which every vowel (a, e, i, o, and u) from the message is removed unless 
 * the vowel is at the very start of a word (i.e., it is preceded by a space or is the first letter of the message). 
 * The program should also remove every repeated non-vowel character (i.e., if a character appears several times in a row 
 * it should only appear once at that location).
 * Finally, the program should output the shortened message, the number of vowels removed, the number of repeated 
 * non-vowel characters removed, and how much shorter the shortened message is than the original message. 
 * The exact format in which the program should print this information is shown in the sample runs.
 */

import java.util.Scanner;

class Lesson2dot7_Exercise_3 {

  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      print("Type the message to be shortened");
      var originalMessage = scanner.nextLine();
      print("");

      if (originalMessage.length() < 10) {
        print("This doesn’t need shortening!");
        return;
      }
      
      var sb = new StringBuilder(originalMessage.toLowerCase());
      int vowelsRemoved = 0;
      //  repeated characters removed = removed - vowelsRemoved
      for (int i = originalMessage.length() - 1; i > 0; i--) {
        char previous = originalMessage.charAt(i - 1);
        char current = originalMessage.charAt(i);
        if (isVowel(current) && !Character.isWhitespace(previous)) {
          vowelsRemoved++;
          sb.deleteCharAt(i);
        }
        else if (current == previous) {
          sb.deleteCharAt(i);
        }
      }

      var newString = sb.toString();
      int totalRemoved = originalMessage.length() - newString.length();
      int dupesRemoved = totalRemoved - vowelsRemoved;

      print("Shortened message:    " + newString);
      print("Vowels removed:       " + vowelsRemoved);
      print("Repeats removed:      " + dupesRemoved);
      print("Total chars saved:    " + totalRemoved);
    }
  }

  public static boolean isVowel(char c) {
    return "aeiou".indexOf(c) != -1;
  }

  public static void print(String text) {
    System.out.println(text);
  }
}