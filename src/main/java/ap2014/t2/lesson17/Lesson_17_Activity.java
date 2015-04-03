package ap2014.t2.lesson17;

/**
 * Created by acorn on 4/2/15.
 */
public class Lesson_17_Activity {
  public static void main(String ... args) {
    int [] a = {3,4,6,9};
    System.out.println(isSorted(a));
    System.out.println(binarySearch(a, 4));
  }
  public static boolean isSorted(int[] a) {
    if (a.length > 1) {
      for (int i = 1; i < a.length; i++) {
        if (a[i - 1] > a[i]) {
          return false;
        }
      }
    }
    return true;
  }

  public static int binarySearch(int[] a, int b) {
    int iMin = 0;
    int iMax = a.length - 1;
    int iMid = iMax / 2;
    while (iMin <= iMax) {
      if (a[iMid] < b) {
        iMin = iMid + 1;
      } else if (a[iMid] > b) {
        iMax = iMid - 1;
      } else {
        return iMid;
      }
      iMid = (iMin + iMax) / 2;
    }
    return -1;
  }
}
