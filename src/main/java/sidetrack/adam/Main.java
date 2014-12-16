package sidetrack.adam;

public class Main {
  public static void main(String[] args) {
    UserInput userInput = new UserInput();
    int first = userInput.getFirstNumber();
    Operator operator = userInput.obtainOperation();
    int second = userInput.getSecondNumber();
    System.out.println(operator.compute(first, second));
  }

  public static void doStuff() {
    int x = 82;
    if (x % 10 >= 5)
      System.out.println("first");
    else if (x % 5 >= 2)
      System.out.println("second");
    else if (x % 20 >= 10)
      System.out.println("third");
    else if (x % 6 == 2)
      System.out.println("fourth");
  }

}
