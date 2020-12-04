package com.algorithm.easy.strings;

public class MarsExploration {


  static int marsExploration(String s) {
    String sos = "SOS";
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != sos.charAt(i % 3)) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int result;
    String param;

    // 1
    param = "SOSSOT";
    result = marsExploration(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    // 0
    param = "SOSSOSSOS";
    result = marsExploration(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    // 42
    param = "PPPQQQGGGGGGGGGGGGGGGMMMMMMMMMFFFFFFDDDERT";
    result = marsExploration(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    // 14
    param = "SOSSOSSSSOSOIEISOSPOISOSIUSISO";
    result = marsExploration(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    // 67
    param = "SOSOSOSOSDSDSKWOSDOSDOASDOASDFAFJDFDOSOSOWNSOSOSNDSKDDOSOSOSJDSDSOOSOSDSDOSASSOASDSAOSOSODSDSOASDWS";
    result = marsExploration(param);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();
  }
}
