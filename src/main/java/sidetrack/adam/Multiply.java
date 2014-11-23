package sidetrack.adam;

public class Multiply implements Operator {
  @Override
  public int compute(int a, int b) {
    return a * b;
  }
}
