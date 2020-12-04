package com.algorithm.easy.strings;

public class SuperReducedString {

  static String superReducedString(String s) {

    int idx = 0;
    while (idx < s.length() - 1) {

      if (s.charAt(idx) == s.charAt(idx+1)) {
        System.out.println(s.substring(0, idx) + " + " +s.substring(idx+2));
        s = s.substring(0, idx) + s.substring(idx+2);
        idx = 0;
        continue;
      }
      idx++;
    }
    if (s.length() == 0) {
      return "Empty String";
    }
    return s;
  }

  public static void main(String[] args) {

    String reduceString = "";

    reduceString = superReducedString("aaabccddd");
    System.out.println("return: " + reduceString);

    reduceString = superReducedString("baab");
    System.out.println("return: " + reduceString);
  }
}
