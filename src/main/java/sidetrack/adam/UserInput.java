package sidetrack.adam;

import java.util.Scanner;

public class UserInput {
  public int getFirstNumber() {
    return obtainNumber("Please enter first number: ");
  }

  public int getSecondNumber() {
    return obtainNumber("Please enter second number: ");
  }

  private int obtainNumber(String message) {
    int input;
    System.out.println(message);
    Scanner scan = new Scanner(System.in);
    input = scan.nextInt();
    //TODO: input validation
    return input;
  }

  public Operator obtainOperation() {
    Operator operator = null;
    System.out.println("Please enter a type of operator: ");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    switch (input) {
      case "+":
        operator = new Add();
        break;
      case "-":
        operator = new Subtract();
        break;
      case "*":
        operator = new Multiply();
        break;
      case "/":
        operator = new Divide();
        break;
      default:
        System.out.println("Invalid operation " + input);
    }
    return operator;
  }
}
