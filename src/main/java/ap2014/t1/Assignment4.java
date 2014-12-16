package ap2014.t1;

import java.util.Scanner;

/**
 * Created by acorn on 12/9/14.
 */
public class Assignment4 {
  public static void main(String[] params) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a tweet:");
    String input = scanner.nextLine();
    if (input.length() > 140) {
      System.out.println("Excess Characters:" + (input.length() - 140));
    } else {
      System.out.println("Length Correct");
      int hashtags = 0;
      int attributions = 0;
      int links = 0;

      for (int i = 0; i < input.length(); i++) {
        char curChar = input.charAt(i);
        switch (curChar) {
          case '@':
            int nextIndex = i + 1;
            if (nextIndex < input.length()) {
              char nextChar = input.charAt(nextIndex);
              if (nextChar != ' ' && nextChar != '\t') {
                ++attributions;
              }
            }
            break;
          case '#':
            nextIndex = i + 1;
            if (nextIndex < input.length()) {
              char nextChar = input.charAt(nextIndex);
              if (nextChar != ' ' && nextChar != '\t') {
                ++hashtags;
              }
            }
            break;
          case 'H':
          case 'h':
            nextIndex = i + 6; // 6 chars after first h ... http://
            if ( nextIndex < input.length()) {
              if ("http://".equals(input.substring(i, nextIndex + 1).toLowerCase())) {
                ++links;
                i = nextIndex;
              }
            }
            break;
        }
      }
      System.out.println("Number of Hashtags: " + hashtags);
      System.out.println("Number of Attributions: " + attributions);
      System.out.println("Number of Links: " + links);
    }
  }
}
