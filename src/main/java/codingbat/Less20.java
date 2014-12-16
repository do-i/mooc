package codingbat;

/**
 * Created by acorn on 12/15/14.
 */
public class Less20 {
  public boolean less20(int n) {
    int rem = n % 20;
    return ((rem + 1) % 20 == 0) || ((rem + 2) % 20 == 0);
  }
}
