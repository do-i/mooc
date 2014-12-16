package ap2014.t1;

import java.util.Scanner;

/**
 * Created by acorn on 12/9/14.
 */
public class Lesson_1011_Activity {
  public static void main(String[] param) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number in base 8:");
    String input = scanner.nextLine();
    if (input.length() > 8) {
      System.out.println("ERROR: Incorrect Octal Format");
    } else {
      int octalIndex = 0;
      int[] octalInput = new int[8];
      for (int i = input.length() - 1; i >= 0;i--, octalIndex++) {
        try {
          char c = input.charAt(i);
          if (c >= '0' && c < '8') {
            octalInput[octalIndex] = Integer.parseInt(String.valueOf(c));
          } else {
            throw new NumberFormatException();
          }
        } catch (NumberFormatException e) {
          System.out.println("ERROR: Incorrect Octal Format");
          return;
        }
      }
      int result = 0;
      for (int i=0; i<octalInput.length; i++) {
        result += octalInput[i] * (int)Math.pow(8, i);
      }
      System.out.println(result);
    }
  }
}
