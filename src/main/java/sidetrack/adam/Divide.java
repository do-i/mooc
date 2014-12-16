package sidetrack.adam;

public class Divide implements Operator {
  @Override
  public int compute(int a, int b) {
    return a / b;
  }
}
