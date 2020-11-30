package com.algorithm.easy.implementation;

public class NumberLineJumps {

  static String kangaroo(int x1, int v1, int x2, int v2) {
    int count = 0;
    while (count <= 10000) {
      if (x1 + (v1 * count) == x2 + (v2 * count)) {
        return "YES";
      }
      count++;
    }

    return "NO";
  }

  public static void main(String[] args) {
    String result = kangaroo(1113, 612, 1331, 610);

    System.out.println(result);
  }
}
