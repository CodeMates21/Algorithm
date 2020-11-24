package com.algorithm.easy.warmup;

import java.util.Arrays;
import java.util.Scanner;

class MiniMaxSum {

  // Complete the miniMaxSum function below.
  static void miniMaxSum(int[] arr) {

    Arrays.sort(arr);
    int min = 0;
    int max = 0;

    for(int i=0;i<4;i++)
      min+=arr[i];
    for(int j=arr.length-1;j>0;j--)
      max+=arr[j];

    System.out.println(min+" "+max);
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[] arr = new int[5];

    String[] arrItems = scanner.nextLine().split(" ");
//    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < 5; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    miniMaxSum(arr);

    scanner.close();
  }
}