package ap2014.t1.lesson12;

import java.util.Scanner;

public class Lesson_12_Activity_Two {
  public static void main(String[] args) {
    System.out.println("Please enter two numbers:");
    Scanner s = new Scanner(System.in);
    System.out.println("Largest is: " + Math.max(s.nextDouble(), s.nextDouble()));
  }
}