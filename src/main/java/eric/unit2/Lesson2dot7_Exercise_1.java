package eric.unit2;

/* Write a code segment to change the name of the�Thing�object�something�such that the new name consists of the old name with one character removed at random.
For example, if�something�has name�"ABCD", its new name could be set to�"ACD".

�*/
import java.util.Scanner;

class Lesson2dot7_Exercise_1 {

  public static void removeRandomCharacter(String newName) {
    int i = (int) (Math.random() * newName.length());
    var sb = new StringBuilder(newName);
    sb.deleteCharAt(i);
    System.out.println(sb.toString());
  }

  public static void main(String[] args) {
    try (var scan = new Scanner(System.in)) {
      var text = scan.next();

      if (text.length() > 0) {
        removeRandomCharacter(text);
      }
    }
  }
}