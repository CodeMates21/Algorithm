package com.algorithm.easy.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class PlusMinus {

  // Complete the plusMinus function below.
  static void plusMinus(int[] arr) {
    Double posi = 0.0;
    Double nega = 0.0;
    Double zero = 0.0;

    for (int a : arr) {
      if (a > 0) {
        posi++;
      } else if (a < 0) {
        nega++;
      } else {
        zero++;
      }
    }
    System.out.println(String.format("%.7f", posi / arr.length));
    System.out.println(String.format("%.7f", nega / arr.length));
    System.out.println(String.format("%.7f", zero / arr.length));
  }

  private static final Scanner scanner = new Scanner(System.in);

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
