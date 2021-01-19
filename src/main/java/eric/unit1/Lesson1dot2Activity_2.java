package eric.unit1;

import java.time.Year;

/*
 * Lesson 1.2 Coding Activity Question 2
 * 
 * Ask the user their name and age and print out how many years until 
 * they are 100. Note that age should be an integer, not a double.
 *
 * Sample run:
 
Hi there. What is your name?
Pascal
Hi Pascal. How old are you?
16
Pascal, you will be 100 in 84 years.

*/

import java.util.Scanner;

class Lesson1dot2Activity_2 {
    public static void main(String[] args) {
        System.out.print("Name? ");
        try (var scanner = new Scanner(System.in)) {
            var name = scanner.nextLine();
            System.out.print("Alright "+name+", what's your age? ");
            var age = (int)scanner.nextDouble();
            System.out.println("You'll be 100 in "+(100-age)+" years.");
            System.out.println("That's a 99% chance you'll die before "+(Year.now().getValue() + 100 - age)+". (Only 1% of people live to 100 years old!)");
        } catch (Exception e) {
            System.out.println("That wasn't valid.");
        }
    }
}