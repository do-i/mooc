package ap2014.t1.lesson24;

/**
 * Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line. Print one space between each number.
 */
public class Lesson_24_Activity_One {
  public static void main(String[] params) {
    for (int i = 23; i <= 89; i++) {
      System.out.print(i + " ");
      if (0 == (i - 23 + 1) % 10) {
        System.out.println("");
      }
    }
  }
}
