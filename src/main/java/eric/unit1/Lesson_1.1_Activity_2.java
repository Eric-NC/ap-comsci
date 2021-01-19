package eric.unit1;

/*
 * Lesson 1.1 Coding Activity Question 2
 * 
 * Write a program to print your name to the center of the output screen on three different lines.
 * 
 * For an extra challenge: complete this problem using only one line of code.
*/

class Lesson_1_Activity_Two {
    public static void main(String[] args) {
        System.out.println(" ".repeat(1000) + "Eric\n" + (" ".repeat(100) + "Eric\n").repeat(2));
    }
}