package ap2014.t1.a1;

import java.util.Scanner;

/**
 * Assignment 1 - Weighted Average
 * <p/>
 * For this assignment, write a program that will input a set of grades and compute a weighted average.
 * The program should input 2 test scores (as ints), 3 quiz scores (also as ints) and a homework average (as a double).
 * The program should then output the test average, quiz average and final grade (as doubles).
 * The final grade should be a weighted average. Count the test average as 50% of the final grade, the quiz average as 30% of the final grade and the homework average as 20% of the final grade.
 * Sample Run:
 * Please enter your test grades.
 * Test 1: 89
 * Test 2: 86
 * <p/>
 * Please enter your quiz grades.
 * Quiz 1: 84
 * Quiz 2: 84
 * Quiz 3: 83
 * <p/>
 * Please enter your homework average.
 * Homework: 90.12
 * <p/>
 * Test Average: 87.5
 * Quiz Average: 83.66666666666667
 * Final Grade: 86.874
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your test grades.");
    int test1 = scanner.nextInt();
    int test2 = scanner.nextInt();
    System.out.println("Please enter your quiz grades.");
    int quiz1 = scanner.nextInt();
    int quiz2 = scanner.nextInt();
    int quiz3 = scanner.nextInt();
    System.out.println("Please enter your homework average.");
    double hw1 = scanner.nextDouble();
    double testAvg =  (test1 + test2) / 2.0;
    double quizAvg = (quiz1 + quiz2 + quiz3) / 3.0;
    double finalGrade = (testAvg * .5) + (quizAvg * .3) + (hw1 * .2);
    System.out.println("Test Average: " + testAvg);
    System.out.println("Quiz Average: " + quizAvg);
    System.out.println("Final Grade: " + finalGrade);
  }
}
