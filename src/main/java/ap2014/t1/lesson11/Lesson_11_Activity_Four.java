package ap2014.t1.lesson11;

import java.util.Scanner;

public class Lesson_11_Activity_Four {
  public static void main(String[] args) {
    System.out.println("Enter a Number:");
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();
    System.out.println((0 == input % 2) ? "Even" : "Odd");
  }
}