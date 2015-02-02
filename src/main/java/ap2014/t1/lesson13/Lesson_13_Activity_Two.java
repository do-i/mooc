package ap2014.t1.lesson13;
/*
 * Lesson 13 Coding Activity 2 
 * Take input of an integer number from the keyboard and print "passing" 
 * if it's greater than or equal to 60, and print "failing" otherwise.
 */


import java.util.Scanner;

class Lesson_13_Activity_Two {
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    if (s.nextInt() < 60) {
      System.out.println("failing");
    } else {
      System.out.println("passing");
    }
  }
}