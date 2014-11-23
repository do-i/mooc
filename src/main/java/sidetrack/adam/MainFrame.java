package sidetrack.adam;

public class MainFrame {
  public static void main(String[] args) {
    UserInput userInput = new UserInput();
    int first = userInput.getFirstNumber();
    Operator operator = userInput.obtainOperation();
    int second = userInput.getSecondNumber();
    System.out.println(operator.compute(first, second));
  }
}
