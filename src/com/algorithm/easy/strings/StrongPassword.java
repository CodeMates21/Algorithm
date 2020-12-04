package com.algorithm.easy.strings;

import java.util.regex.Pattern;

public class StrongPassword {

  static int minimumNumber(int n, String password) {
    String numbers = "0123456789";
    String lower_case = "abcdefghijklmnopqrstuvwxyz";
    String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String special_characters = "!@#$%^&*()-+";

    boolean numberContain = false;
    boolean lowerContain = false;
    boolean upperContain = false;
    boolean specialContain = false;

    int count = 0;

    for (int i = 0; i < password.length(); i++) {
      String passwordChar = Character.toString(password.charAt(i));

      if (numbers.contains(passwordChar)) {
        numberContain = true;
      }

      if (lower_case.contains(passwordChar)) {
        lowerContain = true;
      }

      if (upper_case.contains(passwordChar)) {
        upperContain = true;
      }

      if (special_characters.contains(passwordChar)) {
        specialContain = true;
      }
    }

    if (!numberContain) {
      count++;
    }
    if (!lowerContain) {
      count++;
    }
    if (!upperContain) {
      count++;
    }
    if (!specialContain) {
      count++;
    }

    if (6 - n < count) {
      return count;
    } else {
      return 6 - n;
    }
  }

  static int minimumNumber2(int n, String password) {

    Pattern upperCase = Pattern.compile("[A-Z]");
    Pattern lowerCase = Pattern.compile("[a-z]");
    Pattern numbers = Pattern.compile("[0-9]");
    Pattern special = Pattern.compile("[!@#$%^&*()-+]");

    int count = 0;
    if (!upperCase.matcher(password).find()) {
      count ++;
    }
    if (!lowerCase.matcher(password).find()) {
      count ++;
    }
    if (!numbers.matcher(password).find()) {
      count ++;
    }
    if (!special.matcher(password).find()) {
      count ++;
    }

    int result = Math.max(count, 6 - n);

    return result;
  }

  public static void main(String[] args) {

    int result;
    // 3
    result = minimumNumber(3, "Ab1");
    System.out.println("result: " + result);

    // 1
    result = minimumNumber(11, "#HackerRank");
    System.out.println("result: " + result);

    // 3
    result = minimumNumber(5, "SQZPA");
    System.out.println("result: " + result);

    // 3
    result = minimumNumber(4, "4700");
    System.out.println("result: " + result);

    System.out.println();

    // 3
    result = minimumNumber2(3, "Ab1");
    System.out.println("result: " + result);

    // 1
    result = minimumNumber2(11, "#HackerRank");
    System.out.println("result: " + result);

    // 3
    result = minimumNumber2(5, "SQZPA");
    System.out.println("result: " + result);

    // 3
    result = minimumNumber2(4, "4700");
    System.out.println("result: " + result);

  }

}
