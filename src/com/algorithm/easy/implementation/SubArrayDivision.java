package com.algorithm.easy.implementation;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {

  /*
    # an array of integers, the numbers on each of the squares of chocolate
    s = {2, 2, 1, 3, 2}
    # an integer, Ron's birth day
    d = 4
    # an integer, Ron's birth month
    m = 2
  */

  static int birthday(List<Integer> s, int d, int m) {
    int result = 0;

    for (int i=0; i < s.size(); i++) {
      int sum = 0;
      for (int j=i; j < i+m; j++) {
        if (i+m <= s.size()) {
          sum += s.get(j);
        }
      }
      if (sum == d) {
        result++;
      }
    }

    return result;
  }

  public static void main(String[] args) {

    List<Integer> s = new ArrayList<>();
    s.add(5);
    s.add(2);
    s.add(2);
    s.add(1);
    s.add(5);
    s.add(3);
    s.add(2);

    int result = birthday(s, 9, 3);
    System.out.println(result);
  }

}
