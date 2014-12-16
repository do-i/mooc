package ap2014.t1.a7;

import java.util.Scanner;

public class Main {

  public static void main(String[] params) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a base ten number between 0 and 255, inclusive.");
    int first = scanner.nextInt();
    System.out.println("Enter a base ten number between 0 and 255, inclusive.");
    int second = scanner.nextInt();
    int[] firstBin = convertToBinary(first);
    int[] secondBin = convertToBinary(second);

    System.out.println("First binary number:");
    printBin(firstBin);
    System.out.println("Second binary number:");
    printBin(secondBin);
    System.out.println("Added:");
    printBin(addBin(firstBin, secondBin));

  }

  private static int[] convertToBinary(int b) {
    int[] binary = new int[8];
    for (int i = binary.length - 1; i >= 0; i--) {
      binary[i] = b % 2;
      b /= 2;
    }
    return binary;
  }

  private static void printBin(int b[]) {
    for (int i : b) {
      System.out.print(i + " ");
    }
  }

  private static int[] addBin(int a[], int b[]) {
    int[] sum = new int[8];
    for (int i = sum.length - 1; i >= 0; i--) {
      if (a[i] == 1 && b[i] == 1) {
        // TODO check underflow
        sum[i - 1] = 1;
      } else {
        if (sum[i] == 0) {
          sum[i] = a[i] + b[i];
        } else if (a[i] != 0 || a[i] != 0) {
          // TODO check underflow
          sum[i - 1] = 1;
          sum[i] = 0;
        }
      }
    }
    return sum;
  }
}
