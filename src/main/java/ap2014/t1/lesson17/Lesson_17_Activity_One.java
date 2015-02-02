package ap2014.t1.lesson17;/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard. 
 * When the user enters -1, print the average.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 * 
 * 
 */

import java.util.Scanner;

class Lesson_17_Activity_One {
  public static void main(String[] args) {
    System.out.println("Enter the Scores:");
    Scanner scanner = new Scanner(System.in);
    int input;
    int total = 0;
    int count = 0;
    while ((input = scanner.nextInt()) != -1) {
      total += input;
      ++count;
    }
    System.out.println("The average is: " + (double) total / count);
  }
}