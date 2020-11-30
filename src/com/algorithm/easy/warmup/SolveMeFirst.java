package com.algorithm.easy.warmup;

import java.util.Scanner;

public class SolveMeFirst {

  static int solveMeFirst(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = 5;
    int b = 4;
    int sum = solveMeFirst(a, b);
    System.out.println(sum);
  }
}
