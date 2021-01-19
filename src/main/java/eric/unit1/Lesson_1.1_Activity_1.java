package eric.unit1;

/*
 * Lesson 1.1 Coding Activity Question 1
 * 
 * Write a program to print your name to the center of the output screen. 
 * Use tabs or spaces to center your output, depending on how wide your screen is. 
 * For the code-runner, only one tab or space will be needed for your program to 
 * be counted as acceptable.
 * 
*/

class Lesson_1_Activity_One {
    public static void main(String[] args) {
        // So today I learned that Java DOES NOT HAVE a way to get the console buffer width and height.
        // This is sad.
        // Time for magic numbers.

        System.out.println(" ".repeat(1000) + "Eric");
    }
}