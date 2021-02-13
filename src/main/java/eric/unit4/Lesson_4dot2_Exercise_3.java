package eric.unit4;

/*
There are two objects moving in opposite direction over the same line, separated by 250 distance units.� 
Write java code that ask the user for a integer number between 1 and 25 representing the collision speed of a object 
(repeat this question until the number meet the requirement), 
repeat the same procedure to ask the user for a second positive integer number representing the collision speed of a second object. 
When the two numbers meet the requirements, use a for loop to print, one per second and one per line, how many seconds remaining for collision between the two objects. 
A method to delay execution one second is provided. 
Do not considerate any acceleration effect. Use distance = speed * time as your main equation using integer division.

Sample run:

Enter a speed for the first object: 10
Enter a speed for the second object: 15
10 second to collision.
9 second to collision.
8 second to collision.
7 second to collision.
6 second to collision.
5 second to collision.
4 second to collision.
3 second to collision.
2 second to collision.
1 second to collision.
Objects collided
 
 */

import java.util.Scanner;

class Lesson_4dot2_Exercise_3 {
  public static void delayOnSecond() {
    try {
      // 1000 milliseconds is one second.
      Thread.sleep(1000);
    }
    catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public static void main(String args[]) {
    try (var scan = new Scanner(System.in)) {
      System.out.print("Enter a number from [1, 25]: ");

      int first = 0;
      while (first < 1 || first > 25)
        first = scan.nextInt();

      System.out.print("Enter a number from [0, 25]: ");

      int second = -1;
      while (second < 0 || second > 25)
        second = scan.nextInt();
      
      float speed = first + second;
      float distance = 250;
      while (distance > 0) {
        System.out.println(distance / speed + " seconds to collision.");
        distance -= speed;
        delayOnSecond();
      }
      System.out.println("Objects collided.");
    }
  }
}