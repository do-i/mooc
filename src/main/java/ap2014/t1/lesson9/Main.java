package ap2014.t1.lesson9;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by acorn on 1/29/15.
 */
public class Main {
  public static void main(String ... param) {
    Set<Integer> set = new TreeSet<Integer>();
    for(int i=0; i<1000; i++) {
      int twenty = (int) (Math.random() * 41) - 20;
      if (twenty < -20 || twenty > 20) {
        throw new RuntimeException("error "+twenty);
      } else {
        set.add(twenty);
      }
    }
    System.out.println(set);
  }
}
