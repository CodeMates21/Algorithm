package com.algorithm.easy.strings;

public class CaesarCipher {

  static String caesarCipher(String s, int k) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String result = "";

    for (char value : s.toCharArray()) {
      if (Character.isLowerCase(value))  {
        int idx = alphabet.indexOf(value) + k;
        if (idx > alphabet.length() - 1) {
          idx = idx % alphabet.length();
        }
        result += Character.toString(alphabet.charAt(idx));

      } else if (Character.isUpperCase(value)) {
        int idx = alphabet.toUpperCase().indexOf(value) + k;
        if (idx > alphabet.length() - 1) {
          idx = idx % alphabet.length();
        }
        result += Character.toString(alphabet.charAt(idx)).toUpperCase();
      } else {
        result += Character.toString(value);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    String result;
    String param;

    param = "middle-Outz";
    result = caesarCipher(param, 2);
    System.out.println("param: " + param + "/ result: " + result);
    System.out.println();


    // Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj
    param = "Always-Look-on-the-Bright-Side-of-Life";
    result = caesarCipher(param, 5);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    // 159357fwzx
    param = "159357lcfd";
    result = caesarCipher(param, 98);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();

    // Lipps_Asvph!
    param = "Hello_World!";
    result = caesarCipher(param, 4);
    System.out.println("param: " + param);
    System.out.println("result: " + result);
    System.out.println();
  }

}
