package ap2014.t2.exam1;

import java.util.ArrayList;

/**
 * http://stackoverflow.com/questions/9806421/concurrentmodificationexception-when-adding-inside-a-foreach-loop-in-arraylist
 */
public class ForEachRemove {
  public static void main(String... params) {
    ArrayList<String> li = new ArrayList<>();
    li.add("egg");
    li.add("milk");
    li.add("chicken");
    removeItem(li, "milk");
    System.out.println(li);
//    removeItems(li, "egg", "chicken");
//    System.out.println(li);
  }

  public static void removeItem(ArrayList<String> li, String remove) {
    for (String s : li)
      if (s.equals(remove))
        li.remove(s);
  }
  public static void removeItems(ArrayList<String> li, String remove1, String remove2) {
    for (String s : li)
      if (s.equals(remove1) || s.equals(remove2))
        li.remove(s);
  }
}
