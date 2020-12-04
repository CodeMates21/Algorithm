package com.algorithm.easy.strings;

public class HackerRankInAString {

  static String hackerrankInString(String s) {
    String hackerrank = "hackerrank";
    int sIdx = 0;
    int hackerrankIdx = 0;
    while (sIdx < s.length()) {
      if (hackerrankIdx == hackerrank.length() - 1) {
        return "YES";
      }
      if (s.charAt(sIdx) == hackerrank.charAt(hackerrankIdx)) {
        hackerrankIdx++;
      }
        sIdx++;
    }
    return "NO";
  }

  public static void main(String[] args) {

    String param;
    String result;
    param = "hereiamstackerrank";
    result = hackerrankInString(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    param = "hhaacckkekraraannk";
    result = hackerrankInString(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    param = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
    result = hackerrankInString(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    param = "hackerworld";
    result = hackerrankInString(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    param = "knarrekcah";
    result = hackerrankInString(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    // NO
    param = "rhackerank";
    result = hackerrankInString(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    // NO
    param = "hhhackkerbanker";
    result = hackerrankInString(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();


  }

}
