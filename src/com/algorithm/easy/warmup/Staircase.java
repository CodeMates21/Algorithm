package com.algorithm.easy.warmup;

import java.util.Scanner;

public class Staircase {

  static void staircase(int n) {
    for (int i=0; i<n; i++) {
      for(int j=1; j < n-i; j++) {
        System.out.print(" ");
      }
      for (int k=0; k < i+1; k++) {
        System.out.print("#");
      }
      System.out.println();
    }

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    staircase(n);

    scanner.close();
  }

}
