package com.algorithm.easy.implementation;

public class DivisibleSumPairs {

  /*
    n: the integer length of array ar
    ar: an array of integers
    k: the integer to divide the pair sum by
  */
  static int divisibleSumPairs(int n, int k, int[] ar) {
    int result = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if ((ar[i] + ar[j]) % k == 0) {
          result++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {

    int[] ar = new int[]{1, 3, 2, 6, 1, 2};

    int result = divisibleSumPairs(6, 3, ar);

    System.out.println(result);
  }
}
