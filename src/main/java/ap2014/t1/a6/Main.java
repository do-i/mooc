package ap2014.t1.a6;

import java.util.Scanner;

/**
 * Assignment 6 - Merge Arrays
 * <p/>
 * In this lab, you will be creating a program that merges two arrays of positive integers. Your program will accept each array as input from the keyboard. You do not know ahead of time how many values will be entered, but you can assume each array will have a maximum length of 10,000 elements. To stop entering values enter a negative number. You may disregard any negative numbers input and not store these in the array.
 * The elements of the two input arrays should be in increasing order. In other words, each array element must have a value that is greater than or equal to the previous element value. An array may contain repeated elements.
 * After the two arrays have been input, your program must check to make sure the elements of each array have been entered in order. If an out of order element is found, print the message “ERROR: Array not in correct order”.
 * Your task is to merge the two input arrays into a new array, with all elements in order, lowest to highest. Print out each of the original arrays entered, followed by the merged array.
 * Please note that your program must output the arrays with exactly one space between each of the numbers.
 * Sample Run 1:
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int indexFirst = 0;
    int indexSecond = 0;
    int[] first = new int[10000];
    int[] second = new int[10000];
    System.out.println("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
    do {
      int value = scanner.nextInt();
      if (value < 0) {
        break;
      }
      first[indexFirst++] = value;
    } while (true);

    System.out.println("Enter the values for the second array, up to 10000 values, enter a negative number to quit");
    do {
      int value = scanner.nextInt();
      if (value < 0) {
        break;
      }
      second[indexSecond++] = value;
    } while (true);

    System.out.println("First Array:");
    for (int i = 0; i < indexFirst; i++) {
      System.out.print(first[i] + " ");
    }
    System.out.println("\n");

    System.out.println("Second Array:");
    for (int i = 0; i < indexSecond; i++) {
      System.out.print(second[i] + " ");
    }
    System.out.println("\n");

    for (int i = 1; i < indexFirst; i++) {
      if (first[i-1] > first[i] ) {
        System.out.println("ERROR: Array not in correct order");
        return;
      }
    }

    for (int i = 1; i < indexSecond; i++) {
      if (second[i-1] > second[i] ) {
        System.out.println("ERROR: Array not in correct order");
        return;
      }
    }

    int[] merged = new int[indexFirst + indexSecond];
    int curIdx1 = 0;
    int curIdx2 = 0;
    for(int mergedIdx = 0; mergedIdx < merged.length; mergedIdx++) {
      if (curIdx2 == indexSecond) {
        merged[mergedIdx] = first[curIdx1++];
      } else if (curIdx1 == indexFirst) {
        merged[mergedIdx] = second[curIdx2++];
      } else if (first[curIdx1] < second[curIdx2]) {
        merged[mergedIdx] = first[curIdx1++];
      } else {
        merged[mergedIdx] = second[curIdx2++];
      }
    }

    System.out.println("Merged Array:");
    for (int i = 0; i < merged.length; i++) {
      System.out.print(merged[i] + " ");
    }
  }
}
