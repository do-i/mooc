package ap2014.t2.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by acorn on 1/16/15.
 */
public class Main {
  public static void main(String [] params) {
    ArrayList words = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while(true) {
      String word = scanner.nextLine();
      if ("STOP".equals(word)) {
        break;
      }
      words.add(word);
    };
    System.out.println(words.size());
    System.out.println(words);
    if (words.size() > 2) {
      words.remove(0);
      words.remove(words.size() - 1);
      System.out.println(words);
    }
  }
}

