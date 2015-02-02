package ap2014.t1.lesson13;
/*
 * Lesson 13 Coding Activity 3 
 * Input two integers and print the largest. If they are equal print "EQUAL". 
 * You should be able to do this with only one if statement but you may use multiple else statements.
 */


import java.util.Scanner;

class Lesson_13_Activity_Three {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      if (a < b) {
        System.out.println(b);
      } else if (a > b) {
        System.out.println(a);
      } else {
        System.out.println("EQUAL");
      }
  }
}