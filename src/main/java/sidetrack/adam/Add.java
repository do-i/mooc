package sidetrack.adam;

public class Add implements Operator {
  @Override
  public int compute(int a, int b) {
    return a + b;
  }
}
