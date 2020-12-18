package com.algorithm.easy.sorting;

import java.util.Arrays;

public class CountingSort1 {

  static int[] countingSort(int[] arr) {
    int[] counts = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      counts[arr[i]]++;
    }

    return counts;
  }

  public static void main(String[] args) {

    int[] array;
    int[] result;
    array = new int[]{20, 10, 15, 14, 1, 2, 12, 3, 1, 10, 5, 7, 3, 19, 17, 13, 11, 8, 9, 11, 6};

    result = countingSort(array);
    System.out.println("parameter: " + Arrays.toString(array));
    System.out.println("result: " + Arrays.toString(result));
  }

}
