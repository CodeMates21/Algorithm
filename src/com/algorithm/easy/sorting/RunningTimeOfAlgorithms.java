package com.algorithm.easy.sorting;

public class RunningTimeOfAlgorithms {

  static int runningTime(int[] arr) {
    int count = 0;
    for (int i = 1; i < arr.length; i++) {
      int value = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > value) {
        arr[j + 1] = arr[j];
        j = j - 1;
        count++;
      }
      arr[j + 1] = value;
    }

    printArray(arr);

    return count;
  }

  static void printArray(int[] array) {
    for (int n : array) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr;
    int count;

    arr = new int[]{2, 1, 3, 1, 2};
    count = runningTime(arr);
    System.out.println("result: " + count);

    arr = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
    count = runningTime(arr);
    System.out.println("result: " + count);
  }

}
