package eric.unit1;

/*
 
* Lesson 1.2 Coding Activity Question 1 * 
 
* Input two doubles and print them backwards on the screen. *
 
* So if the user enters: 
 1.3 6.8 
* It should output 
 6.8 1.3 
 
* Notice there is exactly one space between the numbers.
*/

import java.util.Scanner;

class Lesson1dot2_Activity_1 {
    public static void main(String[] args) {
        System.out.println("Input decimal numbers separated by spaces.");
        try (var scanner = new Scanner(System.in)) {
            var parts = scanner.nextLine().split(" ");
            if (parts.length == 0)
                return;
            
            // Print the array in reverse
            for (int i = parts.length - 1; i >= 0; i--) {
                System.out.print(parts[i] + " ");
            }
        }

        // They don't actually have to be doubles. 
        // I don't know why I'd cast them to doubles, either.
    }
}