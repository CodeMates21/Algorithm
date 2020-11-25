package com.algorithm.easy.warmup;

import java.util.Scanner;

public class PlusMinus {
  private static final Scanner scanner = new Scanner(System.in);

  static void plusMinus(int[] arr) {

    int totalCount = arr.length;
    int plus = 0;
    int minus = 0;
    int zero = 0;

    for (int i=0; i < totalCount; i++) {
      if (0 < arr[i]) {
        plus++;
      } else if (arr[i] < 0){
        minus++;
      } else {
        zero++;
      }
    }
    System.out.println(String.format("%.7f",(double) plus / (double) totalCount));
    System.out.println(String.format("%.7f",(double) minus / (double) totalCount));
    System.out.println(String.format("%.7f",(double) zero / (double) totalCount));

  }



  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] arr = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    plusMinus(arr);

    scanner.close();
  }
}
