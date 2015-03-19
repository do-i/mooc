package ap2014.t2.lesson15;

import java.util.Arrays;

/**
 * Created by acorn on 3/18/15.
 */
public class Lesson_15_Activity {
  static String[] list = {"against", "forms", "belief", "government", "democratic", "movement", "understanding"};

  public static void main(String... params) {
    sortAndPrint(list);
  }

  public static void sortAndPrint(String[] list) {
    for (int i = 0; i < list.length; i++) {
      for (int j = i+1; j<list.length; j++) {
        if(list[i].compareTo(list[j]) > 0) {
          String tmp = list[i];
          list[i] = list[j];
          list[j] = tmp;
        }
      }
    }
    for(String word: list) {
      System.out.print(word + " ");
    }
  }
}
