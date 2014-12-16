package ap2014.t1.lesson24;

import java.util.Scanner;

/**
 * Input an int between 0 and 100 and print the numbers between it and 100, including the number itself and the number 100.
 * If the number is not between 0 and 100 print "error". Print 20 numbers per line.
 */
public class Lesson_24_Activity_Three {
  public static void main(String[] params) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 100:");
    int input = scanner.nextInt();
    if (input < 0 || input > 100) {
      System.out.println("error");
    } else {
      for (int i = input; i <= 100; i++) {
        System.out.print(i + " ");
        if (0 == (i - input + 1) % 20) {
          System.out.println("");
        }
      }
    }
  }
}
