package com.algorithm.easy.sorting;

public class InsertionSortPart1 {

  static void insertionSort1(int n, int[] arr) {

    for(int i=n-1; 0 < i; i--) {
      if (arr[i] < arr[i-1]) {
        int temp = arr[i];
        arr[i] = arr[i-1];
        arraysPrint(arr);
        arr[i-1] = temp;
      }
    }
    arraysPrint(arr);
  }

  static void arraysPrint(int[] arr) {
    for (int a : arr) {
      System.out.print(a + " ");
    }
    System.out.println();
  }


  public static void main(String[] args) {

    int[] arr = new int[]{2, 4, 6, 8, 3};

    insertionSort1(arr.length, arr);
  }
}
