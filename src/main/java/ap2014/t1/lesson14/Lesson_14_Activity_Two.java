package ap2014.t1.lesson14;
/*
 * Lesson 14 Coding Activity 2
 * Write a program to input two integers and print 
 * "Both are positive or zero." to the screen, if both are positive or zero.
 * Print "One or both are negative." otherwise.
 */


import java.util.Scanner;

class Lesson_14_Activity_Two {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter two integers: ");
    int a = s.nextInt();
    int b = s.nextInt();
    if (a >= 0 && b >= 0) {
      System.out.println("Both are positive or zero.");
    } else {
      System.out.println("One or both are negative.");
    }
  }
}
