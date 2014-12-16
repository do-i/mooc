package codingbat;

/**
 * Created by acorn on 12/15/14.
 */
public class FizzString2 {
  public static void main(String [] params) {
    new FizzString2().fizzString2(3);
  }
  public String fizzString2(int n) {
    String result = "";
    if (n % 3 == 0){
      result = "Fizz";
    }
    if (n % 5 == 0){
      result += "Buzz";
    }
    if (result.length() == 0){
      result = ""+n;
    }
    return result + "!";
  }
}
