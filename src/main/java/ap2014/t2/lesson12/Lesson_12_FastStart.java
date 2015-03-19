package ap2014.t2.lesson12;

import java.util.ArrayList;

public class Lesson_12_FastStart {
  public static void main(String ... params) {
    String [] tenWords = new String[]{"one","two","three","four","five","six","sev","ok","nou","dek"};
    ArrayList<String> strings = new ArrayList<String>();
    for (String word: tenWords) {
      strings.add(word);
    }
    int firstWordIndex = (int)(Integer.MAX_VALUE * Math.random()) % tenWords.length;
    int secondWordIndex = (int)(Integer.MAX_VALUE * Math.random()) % tenWords.length;
    System.out.println(strings.remove(firstWordIndex) + " " + strings.get(secondWordIndex));
  }
}

