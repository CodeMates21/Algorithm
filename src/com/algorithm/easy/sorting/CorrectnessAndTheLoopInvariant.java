package com.algorithm.easy.sorting;

public class CorrectnessAndTheLoopInvariant {

  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int value = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > value) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = value;
    }

    printArray(arr);
  }


  static void printArray(int[] arr) {
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    int[] arr = new int[]{7, 4, 3, 5, 6, 2};

    insertionSort(arr);
  }

}
