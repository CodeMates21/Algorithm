package com.algorithm.easy.implementation;

public class AppleAndOrange {

  /*
  s: integer, starting point of Sam's house location.
  t: integer, ending location of Sam's house location.
  a: integer, location of the Apple tree.
  b: integer, location of the Orange tree.
  apples: integer array, distances at which each apple falls from the tree.
  oranges: integer array, distances at which each orange falls from the tree.
  */

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    int appleCount = 0;
    int orageCount = 0;

    for (int i=0; i < apples.length; i++) {
      if (s <= apples[i] + a && apples[i] + a <= t) {
        appleCount++;
      }
    }

    for (int i=0; i < oranges.length; i++) {
      if (s <= oranges[i] + b && oranges[i] + b <= t) {
        orageCount++;
      }
    }

    System.out.println(appleCount);
    System.out.println(orageCount);
  }

  public static void main(String[] args) {

    int[] apples = new int[]{2};
    int[] oranges = new int[]{-2};

    countApplesAndOranges(2, 3, 1, 5, apples, oranges);
  }

}
