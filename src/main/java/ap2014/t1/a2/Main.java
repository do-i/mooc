package ap2014.t1.a2;

import java.util.Scanner;

/**
 * Assignment 2 - Change Machine

 Write a program that will simulate a change machine found at cash registers. Input the amount due and amount paid from the keyboard.
 Tell the user how much change is owed and number of quarters, dimes, nickels, and pennies in change a customer would receive.
 Pay special attention to roundoff error. Your program should use division and modular division. No if’s or loops may be used. You may assume all change will be between $0 and $.99
 Hint: Modular division is a great way to find the remainder of a division. Think about how you can use this to calculate the change that is left over after some coins are given.
 Sample Run:
 Please Enter the Cost of the Item:
 4.57
 Please Enter the Amount Paid:
 5.00
 Change Owed: 0.43
 Quarters: 1
 Dimes: 1
 Nickels: 1
 Pennies: 3
 */
public class Main {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter the Cost of the Item: ");
    double cost = scanner.nextDouble();
    System.out.println("Please Enter the Amount Paid: ");
    double paid = scanner.nextDouble();
    int change = (int)(paid * 100 - cost * 100);
    System.out.println("Change Owed: " + change / 100.0);
    int quarters = change / 25;
    change = change % 25;
    int dimes = change / 10;
    change = change % 10;
    int nickels = change / 5;
    change = change % 5;
    int pennies = change;
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
  }
  public static void beta(String [] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter the Cost of the Item: ");
    double cost = scanner.nextDouble();
    System.out.println("Please Enter the Amount Paid: ");
    double paid = scanner.nextDouble();
    int change = (int)(paid * 100 - cost * 100);
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;
    if (change > 0) {
      System.out.println("Change Owed: " + change / 100.0);
      quarters = change / 25;
      change = change % 25;
      dimes = change / 10;
      change = change % 10;
      nickels = change / 5;
      change = change % 5;
      pennies = change;
    }
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
  }
}
