package ap2014.t1.lesson12;
/*
 * Lesson 12 Coding Activity 3 
 * Input two decimal numbers and print the largest.
 * If the numbers are equal, print one of them.
 *     
 *     Sample Run 1
 *         Enter a test score:
 *         78.5
 *         Valid
 *
 *         
 *      Sample Run 2
 *         Enter a test score:
 *         179
 *         Not Valid         
 * 
 */


import java.util.Scanner;

public class Lesson_12_Activity_Three {
    public static void main(String[] args)
     {
       Scanner s = new Scanner(System.in);
       double score = s.nextDouble();
       if(score < 0.0 || score > 100.0){
         System.out.print("Not ");
       }
       System.out.println("Valid");
    }
}