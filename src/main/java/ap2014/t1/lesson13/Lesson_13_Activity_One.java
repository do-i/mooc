package ap2014.t1.lesson13;
/*
 * Lesson 13 Coding Activity 1 
 * Take input of an integer number from the keyboard 
 * and print "Positive" if it's positive or zero, and print "Negative" otherwise.
 */


import java.util.Scanner;

public class Lesson_13_Activity_One {
    public static void main(String[] args)
     {
       Scanner s = new Scanner(System.in);
       if (s.nextInt() < 0) {
         System.out.println("Negative");
       } else {
         System.out.println("Positive");
       }
    }
}