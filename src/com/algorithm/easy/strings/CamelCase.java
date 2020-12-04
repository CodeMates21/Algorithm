package com.algorithm.easy.strings;

public class CamelCase {

  static int camelcase(String s) {

    s = s.substring(0, 1).toUpperCase() + s.substring(1);
    String[] result = s.split("(?=[A-Z])");
    for (int i =0; i < result.length; i++) {
      System.out.println(result[i]);
    }

    return result.length;
  }


  public static void main(String[] args) {
    int result;

    result = camelcase("saveChangesInTheEditor");
    System.out.println("result: " + result);

    result = camelcase("camelCase");
    System.out.println("result: " + result);

  }

}
