package ap2014.t1.lesson12;
/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

class Lesson_12_Activity_One {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double avg = (s.nextDouble() + s.nextDouble() + s.nextDouble()) / 3.0;
    if (avg >= 89.5) {
      System.out.println("ABOVE AVERAGE");
    }
  }
}