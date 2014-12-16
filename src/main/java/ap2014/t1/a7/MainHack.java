package ap2014.t1.a7;

import java.util.Scanner;


public class MainHack {

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
    System.out.println(addBin(first, second));

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

  private static String addBin(int a, int b) {
    int sum = a + b;
    String binTxt = Integer.toBinaryString(sum);
    int padCount = 8 - binTxt.length();
    String pad = "";
    for (int i = 0; i < padCount; i++) {
      pad += "0";
    }
    binTxt = pad + binTxt;
    String output = "";
    for (int i = 0; i < 8; i++) {
      char c = binTxt.charAt(i);
      output += c + " ";
    }
    return output.substring(0, 15);
  }

  private static int[] addBin(int a[], int b[]) {
    int[] sum = new int[8];
    for (int i = sum.length - 1; i >= 0; i--) {
      if (sum[i] == 0) {
        if (a[i] == 1 && b[i] == 1) {
          // TODO check underflow
          sum[i - 1] = 1;
        } else {
          sum[i] = a[i] + b[i];
        }
      } else {
        if (a[i] == 1 && a[i] == 1) {
          sum[i - 1] = 1;
        } else if (a[i] == 0 || a[i] == 0) {
          // noop
        } else {
          sum[i - 1] = 1;
          sum[i] = 0;
        }
      }
    }
    return sum;
  }
}
