package ap2014.t1.lesson3;

import java.util.Scanner;

public class Lesson_3_Activity {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Hi there. What is your name?");
    String name = scan.nextLine();
    System.out.println("What adjective describes you?");
    String adj = scan.nextLine();
    System.out.println("My name is " + name + ". I am " + adj + ".");
  }
}