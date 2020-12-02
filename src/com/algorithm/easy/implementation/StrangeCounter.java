package com.algorithm.easy.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StrangeCounter {

  private static final Scanner scanner = new Scanner(System.in);

  // Complete the strangeCounter function below.
  static long strangeCounter(long t) {

    long result = 0;
    long num = 1;
    int count = 0;
    long initialNumber = 3;

    while (num > 0) {
      if (count == 0) {
        count++;
        num = t - initialNumber;
        result = initialNumber;
      } else {
        initialNumber *= 2;
        num -= initialNumber;
        result += initialNumber;
      }
    }

    return result - t + 1;


  }

  public static void main(String[] args) throws IOException {

    long t = scanner.nextLong();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    long result = strangeCounter(t);

    System.out.println(result);
    scanner.close();
  }
}
