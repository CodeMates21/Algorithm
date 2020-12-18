package com.algorithm.easy.sorting;

public class InsertionSortPart2 {

  static void insertionSort2(int n, int[] arr) {
    for (int i = 1; i < n; i++) {
      for (int j = i; 0 < j; j--) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
      arraysPrint(arr);
    }
  }

  static void arraysPrint(int[] arr) {
    for (int a : arr) {
      System.out.print(a + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr;

    arr = new int[]{1, 4, 3, 5, 6, 2};
    insertionSort2(arr.length, arr);

    arr = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
    insertionSort2(arr.length, arr);
  }

}
