package com.algorithm.easy.implementation;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

  static class Result {

    public static int getTotalX(List<Integer> a, List<Integer> b) {

      int gcdInt = gcd(b);
      int lcmInt = lcm(a);

      int count = 0;
      int index = 1;
      int comp = 0;

      while (comp < gcdInt) {
        comp = lcmInt * index;
        if (gcdInt % comp == 0) {
          count++;
        }
        index++;
      }

      return count;
    }

    private static int gcd(List<Integer> integers) {
      int result = integers.get(0);
      for (int i = 1; i < integers.size(); i++) {
        result = gcd(result, integers.get(i));
      }
      return result;
    }

    private static int gcd(int a, int b) {
      while (b > 0) {
        int temp = b;
        b = a % b;
        a = temp;
      }
      return a;
    }

    private static int lcm(List<Integer> integers) {
      int result = integers.get(0);

      for (int i = 1; i < integers.size(); i++) {
        result = lcm(result, integers.get(i));
      }
      return result;
    }

    private static int lcm(int a, int b) {
      return (a * b) / gcd(a, b);
    }
  }

  public static void main(String[] args) {

    List<Integer> a = new ArrayList<>();
    a.add(2);
    a.add(4);
    List<Integer> b = new ArrayList<>();
    b.add(16);
    b.add(32);
    b.add(96);

    int result = Result.getTotalX(a, b);

    System.out.println(result);
  }
}
