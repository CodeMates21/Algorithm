package com.algorithm.easy.strings;

public class SeparateTheNumbers {

    static void separateNumbers(String s) {
      boolean result = false;

      long firstNumber = 0;
      for (int i = 1; i * 2 <= s.length(); i++) {
        firstNumber = Long.parseLong(s.substring(0, i));

        String compareString = "";
        long next = firstNumber;
        while (compareString.length() < s.length()) {
          compareString += next;
          next++;
        }
        if (compareString.equals(s)) {
          result = true;
          break;
        } else {
          result = false;
        }
      }
      if (result) {
        System.out.println("YES " + firstNumber);
      } else {
        System.out.println("NO");
      }
    }


  public static void main(String[] args) {
    String param;

    param = "99910001001";
    System.out.println("param: " + param);
    separateNumbers(param);
    System.out.println();

    param = "13";
    System.out.println("param: " + param);
    separateNumbers(param);
    System.out.println();

    param = "91011";
    System.out.println("param: " + param);
    separateNumbers(param);
    System.out.println();

    param = "1";
    System.out.println("param: " + param);
    separateNumbers(param);
    System.out.println();

  }

}