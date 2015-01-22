package ap2014.t2.assignment1;
/*
 * AP CS MOOC
 * Term 2 - Assignment 1: Time
 * A class which represents the time of day in hours and seconds.
 */

public class Time {
  private int hour;
  private int minute;

     /* Complete required constructors and methods here */

  /*
   *Default constructor that sets time to 1200.
   */
  public Time() {
    hour = 12;
    minute = 0;
  }

  /*
   * If h is between 1 and 23 inclusive, set the hour to h.
   * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive,
   * set the minutes to m. Otherwise, set the minutes to 0.
   */
  public Time(int h, int m) {
    hour = (h >= 1 && h <= 23) ? h : 0;
    minute = (m >= 0 && m <= 59) ? m : 0;
  }

  /* Returns the time as a String of length 4 in the format: 0819.
   * Notice that if the hour or minute is one digit, it should
   * print a zero first. For example, 6 should print as 06.
  */
  public String toString() {
    return "" + (hour <= 9 ? "0" : "") + hour + (minute <= 9 ? "0" : "") + minute;
  }

  /*
   * Returns the time as a String converted from military time
   * to standard time. For example, 0545 becomes 5:45 am and
   * 1306 becomes 1:06 pm.
   */
  public String convert() {
    int h = hour;
    if (h >= 13) {
      h -= 12;
    }
    if (h == 0) {
      h = 12;
    }
    return h + ":" + (minute <= 9 ? "0" : "") + minute + (hour < 12 ? " am" : " pm");
  }

  /*
   * Advances the time by one minute.
   * Remember that 60 minutes = 1 hour.
   * Therefore, if your time was 0359, and you add one minute,
   * it becomes 0400. 2359 should increment to 0000.
   */
  public void increment() {
    if (minute == 59) {
      minute = 0;
      if (hour != 23) {
        ++hour;
      } else {
        hour = 0;
      }
    } else {
      ++minute;
    }
  }
}