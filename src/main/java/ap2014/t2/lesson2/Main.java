package ap2014.t2.lesson2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by acorn on 1/16/15.
 */
public class Main {
  public static void main(String [] params) {
    ArrayList<String> words = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while(true) {
      String word = scanner.nextLine();
      if ("STOP".equals(word)) {
        break;
      }
      words.add(word);
    };

    for (String word: words) {
      if (word.contains("a")) {
        System.out.println(word);
      }
    }
  }
}

