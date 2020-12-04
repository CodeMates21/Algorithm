package com.algorithm.easy.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeightedUniformStrings {

  static String[] weightedUniformStrings(String s, int[] queries) {
    Set<Integer> valueList = new HashSet<>();
    List<String > result = new ArrayList<>();

    int sum = 0;
    char tmp = ' ';

    for (char c : s.toCharArray()) {
      int value = c - 'a' + 1;
      if (tmp == c) {
        sum += value;
      } else {
        sum = value;
      }
      tmp = c;
      valueList.add(sum);
    }

    for (int i : queries) {
      if (valueList.contains(i)) {
        result.add("Yes");
      } else {
        result.add("No");
      }
    }

    return result.toArray(new String[result.size()]);
  }

  public static void main(String[] args) {

    String param1;
    int[] param2;
    String[] result;
    param1 = "abccddde";
    param2 = new int[]{1, 3, 12, 5, 9, 10};
    result = weightedUniformStrings(param1, param2);
    print(param1, param2, result);

    param1 = "aaabbbbcccddd";
    param2 = new int[]{5, 9, 7, 8, 12, 5};
    result = weightedUniformStrings(param1, param2);
    print(param1, param2, result);
  }

  private static void print(String param1, int[] param2, String[] result) {
    System.out.println("param1: " + param1);
    System.out.print("param2: ");
    for (int i : param2) {
      System.out.print(i + " ");
    }
    System.out.print("\nresult: ");
    for (String s : result) {
      System.out.print(s + " ");
    }
    System.out.println("\n");
  }
}
