package sidetrack.adam;

public class Subtract implements Operator {
  @Override
  public int compute(int a, int b) {
    return a - b;
  }
}
