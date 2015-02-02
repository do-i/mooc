package ap2014.t1.assignment3;

import java.util.Scanner;

/**
 * Created by acorn on 1/23/15.
 */
public class Main {
  private static final String[] HOROSCOPES = {
      "Capricorn", "Aquarius", "Pisces",
      "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra",
      "Scorpio", "Sagittarius"};
  private static final String[] MONTHS = {
      "January", "February", "March", "April", "May", "June", "July",
      "August", "September", "October", "November", "December"};
  private static final String[] DAYS = {
      "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth",
      "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
      "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first",
      "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth",
      "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth", "thirty-first"};

  public static void main(String[] param) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What month were you born in?(number)");
    int month = scanner.nextInt();
    System.out.println("What day (number)");
    int day = scanner.nextInt();
    if (month < 1 || month > 12 || day < 1 || day > 31) {
      System.out.println("error");
      return;
    }

    System.out.println("Your birthday is: " + MONTHS[month - 1] + " " + DAYS[day - 1]);
    String horoscope = null;
    switch (month) {
      case 1:
        horoscope = HOROSCOPES[(day >= 20) ? month : month - 1];
        break;
      case 2:
        horoscope = HOROSCOPES[(day >= 19) ? month : month - 1];
        break;
      case 3:
        horoscope = HOROSCOPES[(day >= 21) ? month : month - 1];
        break;
      case 4:
        horoscope = HOROSCOPES[(day >= 20) ? month : month - 1];
        break;
      case 5:
        horoscope = HOROSCOPES[(day >= 21) ? month : month - 1];
        break;
      case 6:
        horoscope = HOROSCOPES[(day >= 21) ? month : month - 1];
        break;
      case 7:
        horoscope = HOROSCOPES[(day >= 23) ? month : month - 1];
        break;
      case 8:
        horoscope = HOROSCOPES[(day >= 23) ? month : month - 1];
        break;
      case 9:
        horoscope = HOROSCOPES[(day >= 23) ? month : month - 1];
        break;
      case 10:
        horoscope = HOROSCOPES[(day >= 23) ? month : month - 1];
        break;
      case 11:
        horoscope = HOROSCOPES[(day >= 22) ? month : month - 1];
        break;
      case 12:
        horoscope = HOROSCOPES[(day >= 22) ? 0 : month - 1];
        break;
    }
    System.out.println(horoscope);
  }
}
