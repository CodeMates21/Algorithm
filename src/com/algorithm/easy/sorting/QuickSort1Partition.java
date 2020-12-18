package com.algorithm.easy.sorting;

import java.util.Arrays;

public class QuickSort1Partition {

  static int[] quickSort(int[] ar) {
    int compareValue = ar[0];
    int arLength = ar.length;

    int left[] = new int[arLength];
    int right[] = new int[arLength];

    int rightIdx = 0;
    int leftIdx = 0;
    int resultIdx = 0;

    for (int i = 1; i < arLength; i++) {
      if (compareValue < ar[i]) {
        right[rightIdx++] = ar[i];
      } else {
        left[leftIdx++] = ar[i];
      }
    }

    for (int i = 0; i < leftIdx; i++) {
      ar[resultIdx++] = left[i];
    }

    ar[resultIdx++] = compareValue;

    for (int i = 0; i < rightIdx; i++) {
      ar[resultIdx++] = right[i];
    }

    return ar;

  }

  public static void main(String[] args) {

    int[] array;
    int[] result;
    array = new int[]{4, 5, 3, 7, 2};

    result = quickSort(array);
    // 4 5 3 7 2
    System.out.println("parameter: " + Arrays.toString(result));
    // 3 2 4 5 7
    System.out.println("result: " + Arrays.toString(result));
  }

}
