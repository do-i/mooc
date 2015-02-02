package ap2014.t1.lesson20;/*
 * Lesson 20 Coding Activity 
 * 
 * Computer science jobs are in demand. Right now we have a shortage 
 * of people that can do computer programming, and one of the fastest
 * growing areas of new jobs in the sector are so-called hybrid jobs. 
 * This means you specialize in an area like biology, 
 * and then use computer programming to do your job. 
 * 
 * These hybrid jobs exist in the arts, sciences,
 * economics, healthcare, and entertainment fields.
 * 
 * One of these jobs is computational biology. Computational Biology, 
 * sometimes referred to as bioinformatics, is the science of 
 * using biological data to develop algorithms and relations
 * among various biological systems.
 * 
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. We�ll input the longitude and
 * latitude data from a tracking device. We want to investigate 
 * the farthest north, south, east and west Gracie has been.
 * 
 * We will use the latitude to measure this.
 * Write a program to enter Gracie�s longitude and Latitude data. 
 * Each time through the loop it should ask if you want to continue. 
 * Enter 1 to repeat, 0 to stop.
 * 
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 * 
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 *
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude: 
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947  
 *              Farthest West: 69.862
 *   
 */

import java.util.Scanner;

class Lesson_20_Activity {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double farthestNorth = -90;
    double farthestSouth = 90;
    double farthestEast = -180;
    double farthestWest = 180;
    int flag = 1;
    while (flag == 1) {
      System.out.println("Please enter the latitude:");
      double lat = scanner.nextDouble();
      System.out.println("Please enter the longitude:");
      double lon = scanner.nextDouble();
      if (lat < -90 || lat > 90 || lon < -180 || lon > 180) {
        System.out.println("Incorrect Latitude or Longitude");
        continue;
      }
      if (lat > farthestNorth) {
        farthestNorth = lat;
      }
      if (lat < farthestSouth) {
        farthestSouth = lat;
      }
      if (lon > farthestEast) {
        farthestEast = lon;
      }
      if(lon <farthestWest) {
        farthestWest = lon;
      }
      System.out.println("Would you like to enter another location?");
      flag = scanner.nextInt();
    }
    System.out.println("Farthest North: " + farthestNorth);
    System.out.println("Farthest South: " + farthestSouth);
    System.out.println("Farthest East: " + farthestEast);
    System.out.println("Farthest West: " + farthestWest);
  }
}