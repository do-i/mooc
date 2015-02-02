package ap2014.t1.lesson10;

import java.util.Scanner;

class Lesson_10_Activity {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double in1 = scan.nextDouble();
    double in2 = scan.nextDouble();
    System.out.println("The difference is: " +
        (double) (((int) 1000 * in1) - (int) 1000 * in2) / 1000);
  }
}
