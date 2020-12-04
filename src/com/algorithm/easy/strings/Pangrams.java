package com.algorithm.easy.strings;

public class Pangrams {

  static String pangrams(String s) {
    String sLowerCase = s.toLowerCase();
    for (char letter = 'a'; letter <= 'z'; letter++) {
      if (sLowerCase.indexOf(letter) < 0) {
        return "not pangram";
      }
    }
    return "pangram";
  }

  public static void main(String[] args) {
    String param;
    String result;

    // pangram
    param = "We promptly judged antique ivory buckles for the next prize";
    result = pangrams(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    // not pangram
    param = "We promptly judged antique ivory buckles for the prize";
    result = pangrams(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();
  }

}
