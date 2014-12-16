package ap2014.t1.lesson29;

public class Lesson_29_Activity_One {
  public static String list [] = {"high", "every", "nearing", "checking", "food ", "stand", "value", "best", "energy", "add", "grand", "notation", "abducted", "food ", "stand"};
  public static void main(String [] params) {
    int longestIndex = 0;
    for (int i=1; i<list.length; i++) {
      if ( list[longestIndex].length() < list[i].length()) {
        longestIndex = i;
      }
    }
    System.out.println(list[longestIndex]);
  }
}
